package ru.otus.homework14;

public class ArrayFilterTask implements Runnable {
    private final double[] arr;
    private final int start;
    private final int end;

    public ArrayFilterTask(double[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
