package ru.loginov.learning123;

public class Homework1b {
    //cube (x;y;z) - числовой куб
    //x = 1 .. 10, y = 1.. 10, z = 1 .. 10
    //написать вложенный цикл
    // for
    //    for
    //        for
    //который находит сумму x + y + z
    //и печатает ее, если сумма >= 20
    //1 + 1 + 1 = 3 -> don't print
    //1 + 1 + 2 = 4 -> don't print
    //...
    //9 + 9 + 7 = 25 -> print
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    int a = i + j + k;
                    if (a > 9)
                        System.out.println(a);
                }
            }

        }
    }

}
