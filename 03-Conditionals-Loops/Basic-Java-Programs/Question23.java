/*
 * Question 23 - Basic Java Programs
 *
 * Input a number and print all the factors of that number (use loops).
 */
import java.util.Scanner;
public class Question23 {
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("enter the number ");
            int num=sc.nextInt();
            int count=0;
            for(int i=1;i<=num;i++) {
                if(num%i==0) {
                    count++;
                    System.out.println(i+" is the "+count+" factor");
                }
            }
            
        }


    }
}
