/*
 * Question 1 - Intermediate Java Programs
 *
 * Factorial Program In Java
 */

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; // Used long to handle larger results safely
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
        scanner.close();
    }
}
