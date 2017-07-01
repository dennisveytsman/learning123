package ru.loginov.learning123;

import java.util.*;
import java.util.Arrays;

public class Homework3a {
    //camelCase

    //create function
    //that multiplies all elements of array
    //and returns it as a result
   /* public static void main(String[] args) {


    }

    static double multiplyAll(int[] arr) {

        int a = 1;

        for (int i = 0; i < 6; i++ ) {

            arr = new int[]{1, 2, 3};

            arr[i] * arr[i] = a;

            System.out.println(a);

        }
            return 0;

    }
    //create a test
    //for example:  {2, 4, 5 }
    //result = 40 - check in test
*/
    static int multiplyAll(int[] arr) {
//        return Arrays.stream(arr).sum();
        int result = 1;
        for (int elem : arr) {
            result *= elem;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        System.out.println(multiplyAll(arr));
    }
}
