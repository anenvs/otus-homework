package ru.otus.homework13;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8082)) {
            System.out.println("Сервер запущен и ожидает подключений...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader reader = new BufferedReader(
                             new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter writer = new PrintWriter(
                             clientSocket.getOutputStream(), true)) {

                    handleClientConnection(reader, writer);
                } catch (IOException e) {
                    System.out.println("Ошибка подключения: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Не удалось запустить сервер: " + e.getMessage());
        }
    }

    private static void handleClientConnection(BufferedReader reader, PrintWriter writer) {
        try {
            writer.println("Доступные операции: +, -, *, /");
            writer.println("Формат запроса: число1 операция число2 (пример: 5 + 3)");

            String request = reader.readLine();
            System.out.println("Получен запрос: " + request);

            processRequest(request, writer);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении запроса: " + e.getMessage());
        }
    }

    private static void processRequest(String request, PrintWriter writer) {
        if (request == null || request.trim().isEmpty()) {
            writer.println("Ошибка: пустой запрос");
            return;
        }

        String[] parts = request.split("\\s+");
        if (parts.length != 3) {
            writer.println("Ошибка: неверный формат. Используйте: число1 операция число2");
            return;
        }

        try {
            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[2]);
            String operation = parts[1];

            writer.println(calculateAndFormatResult(num1, operation, num2));
        } catch (NumberFormatException e) {
            writer.println("Ошибка: неверный формат чисел");
        } catch (Exception e) {
            writer.println("Ошибка: " + e.getMessage());
        }
    }

    private static String calculateAndFormatResult(double num1, String operation, double num2) {
        try {
            return "Результат: " + calculate(num1, operation, num2);
        } catch (ArithmeticException | IllegalArgumentException e) {
            return "Ошибка: " + e.getMessage();
        }
    }

    private static double calculate(double num1, String operation, double num2) {
        switch (operation) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/":
                if (num2 == 0) throw new ArithmeticException("деление на ноль");
                return num1 / num2;
            default:
                throw new IllegalArgumentException("неизвестная операция: " + operation);
        }
    }
}