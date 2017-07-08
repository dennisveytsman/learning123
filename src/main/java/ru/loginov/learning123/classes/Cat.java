package ru.loginov.learning123.classes;

public class Cat {
    int age;
    String name;

    public static void main(String[] args) {
        Cat alice = new Cat();
        alice.age = 10;
        alice.name = "Alice";

        Cat bob = new Cat();
        bob.age = 5;
        bob.name = "Bob";

        Cat[] cats = new Cat[] { alice, bob };
        for (Cat cat : cats) {
            System.out.println(cat.name + " aged " + cat.age);
        }

    }

}
