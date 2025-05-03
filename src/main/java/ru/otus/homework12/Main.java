package ru.otus.homework12;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File currentDir = new File(".");
        File[] txtFiles = currentDir.listFiles((dir, name) -> name.endsWith(".txt"));

        if (txtFiles == null || txtFiles.length == 0) {
            System.out.println("В этой папке нет .txt файлов!");
            return;
        }

        System.out.println("Найдены .txt файлы:");
        for (int i = 0; i < txtFiles.length; i++) {
            System.out.println((i + 1) + ") " + txtFiles[i].getName());
        }

        File selectedFile = null;
        while (selectedFile == null) {
            System.out.print("\nВведите имя файла: ");
            String fileName = scanner.nextLine().trim();

            for (File file : txtFiles) {
                if (file.getName().equals(fileName)) {
                    selectedFile = file;
                    break;
                }
            }

            if (selectedFile == null) {
                System.out.println("Файл c таким именем не найден!");
                return;
            }
        }

        System.out.println("\nСодержимое файла " + selectedFile.getName() + ":");
        readFile(selectedFile);

        System.out.print("\nВведите строку для добавления в файл: ");
        String newLine = scanner.nextLine();

        writeToFile(selectedFile, newLine);
        System.out.println("Строка добавлена!");

        scanner.close();
    }

    private static void readFile(File file) {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static void writeToFile(File file, String text) {
        try (BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream(file, true))) { // true = append mode
            out.write((text + "\n").getBytes());
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}