/*
 * Question 7 - Intermediate Java Programs
 *
 * Power In Java
 */
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)) {
            System.out.println("enter the number");
            int num = sc.nextInt();
            System.out.println("enter the exponential power : ");
            int power = sc.nextInt();
            int answer=1;
            for(int i=0;i<power;i++) {
                answer = num * answer;
            }
            System.out.println(answer);
        }
        
    }
}
