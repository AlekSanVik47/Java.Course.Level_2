package Lesson_5;

import java.util.Arrays;

import static java.lang.System.currentTimeMillis;

public class Multithreading {
    static final int size = 10_000_000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    public static float[] arrayOne(float[] arr) {
        long startTime = currentTimeMillis();
        Arrays.fill(Multithreading.arr, 1);
        long stopTime = currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Time passed: " + elapsedTime);
        return arr;
    }

    public static float[] arrayTwo(float[] arr) {
        long startTimeTwo = System.currentTimeMillis();
        arrayOne(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ( float ) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            long stopTimeTwo = System.currentTimeMillis();
            long elapsedTimeTwo = stopTimeTwo - startTimeTwo;
            System.out.println("Time two passed: " + elapsedTimeTwo);
            return arr;
        }
        return arr;
    }

    public static void oneMethod() {
        arrayOne(arr);
        arrayTwo(arr);
    }

    public static void twoMethod() {
        long startTwoMethod = System.currentTimeMillis();
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);
        long division = System.currentTimeMillis();
        new Thread(() -> arrayTwo(arr1)).start();
        new Thread(() -> arrayTwo(arr2)).start();

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long stopTwoMethod = System.currentTimeMillis();
        long elapsedTimeTwoMethod = stopTwoMethod - startTwoMethod;
        System.out.println("The runtime of the second method : " + elapsedTimeTwoMethod);
        System.out.println("Splitting : " + (division - startTwoMethod) + "\nBonding time : " + (stopTwoMethod - division));
    }

    public static void main(String[] args) {
        oneMethod();
        twoMethod();
    }
}




