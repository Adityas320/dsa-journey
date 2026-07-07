/*
 * Question 1
 *
 * Write a program to print whether a number is even or odd, also take
 * input from the user.
 */
import java.util.Scanner;
public class Question1 {
            public static int EO(int a) {
            if(a%2==0) {
                return 1;
            }
            else{
                return 0;
            }
        }
    public static void main(String[] args) {
        // TODO: implement solution
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check even or odd : ");
        int n= input.nextInt();
        System.out.println(EO(n));
        input.close();


    }
}
