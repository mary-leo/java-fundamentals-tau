package chapter5;

/**
 * OUR FIRST METHOD
 * Write a method that asks a user for their name, then greets them by name.
 */

import java.util.Scanner;

public class Greetings {
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Nice to see you)");
    }

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();

        //call the method greet(String Name)
        greetUser(name);
    }
}
