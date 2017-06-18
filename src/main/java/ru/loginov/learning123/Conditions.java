package ru.loginov.learning123;

public class Conditions {

    //psvm
    public static void main(String[] args) {
        //boolean condition = false;
        int i = 1; //assign

        if (i == 1) { //equals ==
            System.out.println("one");
        } else if (i == 2) { //optional
            System.out.println("two");
        } else {
            System.out.println("not one or two");
        }


        switch (i) {
            case 1: System.out.println("one"); break;
            case 2: System.out.println("two"); break;
            default: System.out.println("not one or two");
        }
    }

}
