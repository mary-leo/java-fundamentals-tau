package chapter2;

import java.util.Scanner;

public class QueerSentencePicker {
    public static void main(String[] args) {

        //1. Ask a season of the year
        System.out.println("Enter a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        //2. Ask a whole number
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        //3. Ask an adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        scanner.close();

        //4. Show the result
        // "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee."
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number
                + " cups of coffee.");
    }
}
