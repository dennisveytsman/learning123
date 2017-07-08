package ru.loginov.learning123;

public class Homework4a {

    public static void main(String[] args) {
        int sum = 0;
        //String str = "";
        for (String arg : args) { //foreach
            System.out.print( arg + " + ");
            int element = Integer.valueOf(arg); //"1" -> 1
            sum += element;
            //str  += args;


        }
        System.out.println(" = " + sum);
        //to do implement suming

//       "1" + "2" -> "12"
//        1 + 2 -> 3
//
//       hint:
//        int i = Integer.valueOf("5");


    }

}

