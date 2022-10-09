package chapter4;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter 'A'.
 */

public class LetterSearch {

    public static void main(String args[]) {

        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for letter A
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }

        if (letterFound) {
            System.out.println("The text contains the letter 'A'");
        } else {
            System.out.println("The text don't contains the letter 'A'");
        }
    }
}
