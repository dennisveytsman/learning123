package ru.loginov.learning123;

public class Homework2a {

    public static void main(String[] args) {
        //x^2 + 2 *x + 1 = 0
        //(x + 1)^2 = 0
        //x = -1
        quadraticequation(0.0, 2.0, 1.0);
    }

    static void quadraticequation(double a,double b,double c) {
        if (a != 0) {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                double x1 = (-b - Math.sqrt(d)) / (2 * a);
                double x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println("x1 = " + x1 + " x2 = " + x2);
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.println("x = " + x);
            } else { //d < 0
                System.out.println("No solutions");
            }
        } else { //b * x + c = 0   ->  b * x = -c   ->  x = -c / b
            if (b != 0) {
                double x = -c / b;
                System.out.println("x = " + x);
            } else {
                if (c == 0) { //0 * x = 0
                    System.out.println("x - any number");
                } else { //0 * x != 0
                    System.out.println("No solutions");
                }
            }
        }
    }

    //create function that solves equation:
    // a * x^2 + b * x + c = 0,   a may be eq 0
    //and prints its' solution on console
    //function name: solve
    //returns nothing
    //parameters: a, b, c

    //D = b^2 - 4ac
    //how to take square root:
    // double sqrt = Math.sqrt(9);
    //System.out.println(sqrt);



}
