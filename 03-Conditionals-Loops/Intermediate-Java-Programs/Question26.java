/*
 * Question 26 - Intermediate Java Programs
 *
 * Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
 */
import java.util.Scanner;
public class Question26 {
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)) {
            int n;
            int sumPE=0;
            int sumN=0;
            int sumPO=0;
            do{
                System.out.println("Enter the  numbers");
                n= sc.nextInt();
                if(n<0) {
                    sumN=sumN+n;
                }else if(n%2==0) {
                    sumPE= sumPE +n;
                }else {
                    sumPO = sumPO +n;
                }
            }while(n!=0);
            System.out.println("The sum of positive odd is "+sumPO+" the sum of positive even is "+sumPE+" sum of negative numbers is "+sumN);
        }
    }
}
