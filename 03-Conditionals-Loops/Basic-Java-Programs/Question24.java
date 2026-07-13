/*
 * Question 24 - Basic Java Programs
 *
 * Take integer inputs till the user enters 0 and print the sum of all numbers
 * (HINT: while loop)
 */
import java.util.Scanner;
public class Question24 {
    public static void Input(Scanner sc){
        int sum=0;
        System.out.println("enter the number : ");
        int temp=sc.nextInt();
        while( temp!=0) {
            sum=sum+temp;
            System.out.println("enter the number ");
            temp=sc.nextInt();
        }
        System.out.println("The sum of all numbers is : "+sum);
    }
    public static void main(String[] args) {
        // TODO: implement solution
        Scanner sc= new Scanner(System.in);
        Input(sc);
        sc.close();
    }
}
