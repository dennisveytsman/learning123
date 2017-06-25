package ru.loginov.learning123;

public class MyMath {

    static int sum(int a, int b) {
        return a + b;
    }

    static double avg(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        System.out.println(avg(arr));
    }

}
