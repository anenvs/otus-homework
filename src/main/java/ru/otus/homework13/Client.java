package ru.otus.homework13;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8082);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println(reader.readLine());
            System.out.println(reader.readLine());

            while (true) {
                System.out.print("Введите запрос: ");
                String userInput = scanner.nextLine();

                printWriter.println(userInput);

                String response = reader.readLine();
                System.out.println(response);
            }
        } catch (UnknownHostException e) {
            System.out.println("Сервер не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }
}