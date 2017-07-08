package ru.loginov.learning123;

public class BinarySearch {
/*
        ordered
                                                      |
         1  4  6  9 11 12 15 17 19 23 24 25 30 31 32 70 91
         x  x  x  x  x  x  x  x  x  x  x  x  x  x  x  x  x
         x  x  x  x  x  x  x  x 19  x  x  x 30  x  x  x  x
         x  x  x  x  x  x  x  x 19  x  x  x 30  x 32  x  x
         x  x  x  x  x  x  x  x 19  x  x  x 30  x 32 70  x

         2 ^ z = N
         N = 16 -> z = 4
         N = 100 (128) -> z = 7

                      |
         23 28 34 35 38 41 42 44 47 49 61 63 69 70 73
          x  x  x  x  x  x  x 44  x  x  x  x  x  x  x
          x  x  x 35  x  x  x 44  x  x  x  x  x  x  x
          x  x  x 35  x 41  x 44  x  x  x  x  x  x  x
          x  x  x 35 38 41  x 44  x  x  x  x  x  x  x
*/

    public static void main(String[] args) {
        int[] arr = new int[] {23, 28, 34, 35, 38, 41, 42, 44, 47, 49, 61, 63, 69, 70, 73};
        getIndex(arr, 38);
    }

    static int getIndex(int[] arr, int elem) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        //length = 4; leftIndex = 0; right = 3; (leftIndex + right) / 2 = 3 / 2 = 1.5 -> 1
        while (true) {
            int middleIndex = (leftIndex + rightIndex) / 2; //5 / 3 = 1.666666667 -> 1
            int middleValue = arr[middleIndex];
            System.out.println(middleValue);
            if (elem == middleValue) {
                return middleIndex;
            }
            if (elem > middleValue) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }
    }

}
