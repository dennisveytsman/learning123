package ru.loginov.learning123;

public class Homework1a {
    //1, 3, 5, .. - нечетные - odd
    //0, 2, 4, .. - четные - even
    //5 / 2 = 2 (1) - нечетное, если в остатке единица
    //5 modulus 2 = 1
    //5 % 3 = 2 (5 = 1*3 + 2)
    //System.out.println(5 % 3);

    int i = 5;

    //если i - четное, вывести "even", если не четное вывести "odd"
    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            int a = i % 2;
            System.out.println(" i =" + i + " a =" + a);

            if (i % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");


        }
    }

}
