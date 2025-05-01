package ru.otus.homework8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"3", "1", "5", "2"}, {"1", "2", "3", "1"}, {"1", "2", "3", "3"}, {"1", "2", "3", "5"}};
        try {
            System.out.println(sumArray(arr));
        } catch (AppArraySizeException e) {
            System.out.println("Ошибка размера массива: должен быть 4x4");
        } catch (AppArrayDataException e) {
            System.out.println(e.toString());
        }
    }

    public static int sumArray(String[][] array) throws AppArraySizeException, AppArrayDataException {
        if (array.length != 4) {
            throw new AppArraySizeException();
        }
        for (String[] row : array) {
            if (row.length != 4) {
                throw new AppArraySizeException();
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

    public static boolean isNumber(String str) {
        Pattern p = Pattern.compile("(^0$)|(^[1-9]([0-9])*)$");
        Matcher m = p.matcher(str);
        return m.find();
    }
}
