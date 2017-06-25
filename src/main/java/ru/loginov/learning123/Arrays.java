package ru.loginov.learning123;

public class Arrays {

    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[3] = 15;


        int[] anotherArray = new int[] {10, 20, 15};
        for (int i = 0; i < anotherArray.length; i++) {
            int element = anotherArray[i];
            System.out.println(element);
        }
    }

}
