package ru.loginov.learning123;

import java.util.Random;

public class BubbleSort {

    public static void main1(String[] args) {
        int[] arr = new int[] { 7, 1, 4, 9, 1, 5 }; //comparable
        //1 1 4 5 7 9

        //7 1 4 9 1 5  swapped = true
        //1 4 7 1 5 9  swapped = true
        //1 4 1 5 7 9  swapped = true
        //1 1 4 5 7 9  swapped = false -> finish

        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //bubble sort complexity: n^2
    //log(1) = 0, log(100) = 2, log(1000) = 3
    //n * log(n) - for another sorting alrorithms
    //n = 100:   n^2 = 10_000, n * log(n) = 100*3 = 300
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000); // 0 .. 999
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void sort(int[] arr) {
        int counter = 0;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < arr.length; i++) {
                int curr = arr[i];
                int prev = arr[i - 1];
                counter++;
                if (curr < prev) {
                    arr[i] = prev;
                    arr[i - 1] = curr;
                    swapped = true;
                }
            }
        }
        System.out.println("Operation number: " + counter);
    }

}
