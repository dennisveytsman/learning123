package ru.loginov.learning123;

//Run -> Edit configurations -> Program arguments
public class CommandLineArguments {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello stranger");
        } else {
            System.out.println("Hello " + args[0]);
        }
    }

}
