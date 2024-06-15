package ru.otus.homework8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String[][] arr = {{"3", "1", "5","2"},{"1", "2", "3", "1"},{"1", "2", "3","3"},{"1", "2", "3", "5"}};
        try {
            System.out.println(sumArray(arr));
        } catch (AppArraySizeException e) {
            System.out.println("Ошибка длинны массива");
        } catch (AppArrayDataException e2) {
            System.out.println(e2.toString());
        }
    }

    public static int sumArray(String[][] array) throws AppArraySizeException,AppArrayDataException{
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            int len1 = 0;
            for (int j = 0; j < array[i].length; j++) {
                if(len1 < j){
                    len1 = j;
                }
                if (!isNumber(array[i][j])){
                    throw new AppArrayDataException(i, j);
                }
                sum += Integer.parseInt(array[i][j]);
            }
            if(array.length != 4 || array.length-1 != len1) {
                throw new AppArraySizeException();
            }
        }
        return sum;
    }

    public static boolean isNumber(String str){
        Pattern p = Pattern.compile("(^0$)|(^[1-9]([0-9])*)$");
        Matcher m = p.matcher(str);
        return m.find();
    }
}