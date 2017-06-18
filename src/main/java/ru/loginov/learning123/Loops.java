package ru.loginov.learning123;

public class Loops {

    public static void main(String[] args) { //shift shift
        int j = 5;
//        j = j + 1;
        j++;
        //ctrl+D
        //  1  2  3  4 ..
        //1 1  2  3
        //2 2  4  6
        //3 ..
        for (int i = 1; i < 10; i++) {
            for (int k = 1; k < 10; k++) {
                int m = k * i;
                //m > 10
                if (m >= 10) {
                    System.out.println("i = " + i + " k= " + k + " m =" + m);
                }
            }
        }
    }

}
