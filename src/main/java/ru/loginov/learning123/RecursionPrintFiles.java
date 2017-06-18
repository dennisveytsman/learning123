package ru.loginov.learning123;

import java.io.File;

public class RecursionPrintFiles {

    public static void main(String[] args) {
        printFiles(new File("C:\\Users\\Viktor-Lenovo\\IdeaProjects\\learning123"));
    }

    static void printFiles(File dir) {
        for (File file : dir.listFiles()) {
            if (!file.isDirectory()) {
                System.out.println(file.getName());
            } else {
                System.out.println("dir: " + file.getName());
                printFiles(file);
            }
        }
    }

}
