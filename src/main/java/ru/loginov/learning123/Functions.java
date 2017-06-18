package ru.loginov.learning123;

//methods, procedures
public class Functions {


    static int sqr(int x) { //crated function with name sqr, with one int argument, returning int
        return x * x;
    }

    static void helloWorldFunction() { //no parameters, void -> returns no value
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
//        helloWorldFunction();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(sqr(i));
//        }
        System.out.println(linearEquationSolver(3, 5));
    }

    //a * x + b = 0
    //a * x = - b    divide by a
    //x = - b / a
    //a = 3, b = 5 -> x = -5/3 = - 1.6666667
    static double linearEquationSolver(double a, double b) {
        return -b / a;
    }
    //a * x^2 + b * x + c = 0;

}
