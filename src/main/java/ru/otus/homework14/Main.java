package ru.otus.homework14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int arrSize = 100_000_000;
        final int threadSize = 4;
        double[] arr = new double[arrSize];


        System.out.println("Запуск в один поток");
        long startTime = System.currentTimeMillis();
        fillArraySingleThread(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Время работы в один поток: " + (endTime - startTime));

        double[] arrMutliThread = new double[arrSize];
        System.out.println("\nЗапуск в несколько потоков");
        long startTimeMultiThread = System.currentTimeMillis();
        fillArrayMultiThread(arrMutliThread, threadSize);
        long endTimeMultiThread = System.currentTimeMillis();
        System.out.println("Время работы в несколько потоков: " + (endTimeMultiThread - startTimeMultiThread));
    }

    private static void fillArraySingleThread(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    private static void fillArrayMultiThread(double[] arrMultiThread, int threads) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(threads);
        int partSize = arrMultiThread.length / threads;
        for (int i = 0; i < threads; i++) {
            int start = i * partSize;
            int end;
            if (i == threads - 1) {
                end = arrMultiThread.length;
            } else {
                end = (i + 1) * partSize;
            }
            Runnable task = new ArrayFilterTask(arrMultiThread, start, end);
            executor.execute(task);
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    }

}
