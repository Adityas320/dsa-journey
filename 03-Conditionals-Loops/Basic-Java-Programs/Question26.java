/*
 * Question 26 - Basic Java Programs
 *
 * Addition Of Two Numbers
 */
import java.util.Scanner;
public class Question26 {
    public static void main(String[] args) {
        // TODO: implement solution
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers for addition ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("the addition is "+(a+b));
        sc.close();
    }
}
