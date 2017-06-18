package ru.loginov.learning123;

public class Recursion {

    public static void main(String[] args) {
        //factorial(n) = 1 * 2 * 3 * .. * (n-1) * n
        //factorial(6) = 1 * 2 * 3 * 4 * 5 * 6 = 720
        System.out.println(loopRecursion(6));
    }

    static int loopFactorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //factorial(n)   = 1 * 2 * 3 * .. * (n-1) * n
    //factorial(n-1) = 1 * 2 * 3 * .. * (n-1)
    //factorial(n) = factorial(n-1) * n,  factorial(1) = 1

    //factorial(6) = 1 * 2 * 3 * 4 * 5 * 6
    //factorial(5) = 1 * 2 * 3 * 4 * 5
    //factorial(6) = factorial(5) * 6

    static int loopRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return loopRecursion(n - 1) * n;
        }
    }


}
