package ru.loginov.learning123;

import java.util.Scanner;

public class UserInput {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String name = "undefined";
        int age = -1;

        while (true) {
            System.out.println("Hello " + name + "(" + age + ")");
            int menuItem = menu();
            if (menuItem == 1) {
                return;
            } else if (menuItem == 2) {
                System.out.println("Please enter new name");
                name = scanner.next();
            } else if (menuItem == 3) {
                System.out.println("Please enter new age");
                age = scanner.nextInt();
            }
        }

    }

    static int menu() {
        System.out.println("Select action number");
        System.out.println("1. Exit");
        System.out.println("2. Change name");
        System.out.println("3. Change age");
        return scanner.nextInt();
    }

}
