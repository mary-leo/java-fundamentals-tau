package chapter3;

/** для String (даже если 1 буква) используем обычный scanner.next()
 * !!! Если не поставить break, то message перепишется на следующий (потому что программа
 *     ---- выполнит следующую команду, не взирая на то что в условии case.
 *    -То есть команды в следующих кейсах - выполняются, пока не встретят break, не взирая
 *     ---- на условия в кейсах (даже еоманда из дефолта).
 * SWITCH (equality)
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */

import java.util.Scanner;

public class GradeMessage {

    public static void main(String args[]) {

        //Initialize values we know
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        //Get unknown values

        String message;

        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good bad!";
                break;
            case "D":
                message = "You need to work a bit hard";
                break;
            case "F":
                message = "You must learn it one more time.";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }

        //Make a decision on the path to take - Output
        System.out.println(message);
    }
}
