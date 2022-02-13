package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        linkedList();
        array();
        arrayReverse();
    }

    static void linkedList() {
        long start = System.nanoTime();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println("LL: " + elapsedTime);

        long start2 = System.nanoTime();
        long sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
        long end2 = System.nanoTime();

        long elapsedTime2 = end2 - start2;
        System.out.println("LL sum: " + elapsedTime2);
    }

    static void array() {
        long start = System.nanoTime();
        int[] array = new int[100000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println("Array: " + elapsedTime);

        long start2 = System.nanoTime();
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        long end2 = System.nanoTime();

        long elapsedTime2 = end2 - start2;
        System.out.println("Array sum: " + elapsedTime2);
    }

    static void arrayReverse() {
        int[] array = new int[100000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        long start = System.nanoTime();
        long sum = 0;
        for (int i = array.length - 1; i > -1; i--) {
            sum += array[i];
        }
        System.out.println(sum);
        long end = System.nanoTime();

        long elapsedTime = end - start;
        System.out.println("Array sum in reverse: " + elapsedTime);
    }

}
