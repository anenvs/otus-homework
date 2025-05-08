package ru.otus.homework13;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8082)) {
            System.out.println("Сервер запущен и ожидает подключений...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream(), true)) {

                    System.out.println("Клиент подключен: " + clientSocket.getInetAddress());

                    printWriter.println("Доступные операции: +, - , * , /");
                    printWriter.println("Введите запрос в формате: число1 операция число2 (например: 5 + 3)");

                    String request = reader.readLine();
                    System.out.println("Получен запрос: " + request);

                    try {
                        String[] parts = request.split(" ");
                        double num1 = Double.parseDouble(parts[0]);
                        String operation = parts[1];
                        double num2 = Double.parseDouble(parts[2]);
                        double result;

                        switch (operation) {
                            case "+":
                                result = num1 + num2;
                                break;
                            case "-":
                                result = num1 - num2;
                                break;
                            case "*":
                                result = num1 * num2;
                                break;
                            case "/":
                                if (num2 == 0) {
                                    printWriter.println("Ошибка: деление на ноль!");
                                    continue;
                                }
                                result = num1 / num2;
                                break;
                            default:
                                printWriter.println("Ошибка: неизвестная операция: " + operation);
                                continue;
                        }

                        printWriter.println("Результат: " + result);
                    } catch (Exception e) {
                        printWriter.println("Ошибка: неверный формат запроса. Используйте: число1 операция число2");
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка при работе с клиентом: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Не удалось запустить сервер: " + e.getMessage());
        }
    }
}