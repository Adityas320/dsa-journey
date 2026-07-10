/*
 * Question 25 - Basic Java Programs
 *
 * Take integer inputs till the user enters 0 and print the largest number from
 * all.
 */
import java.util.Scanner;
public class Question25 {
    public static void main(String[] args) {
        int largest;
        int a;
        // TODO: implement solution
       try(Scanner sc = new Scanner(System.in)) {
        System.out.println("enter the number");
         largest = sc.nextInt();
        if(largest==0) {
            return;
        }else {
             do{
                 System.out.println("enter the number");
                     a=sc.nextInt();
                     if(a>=largest&&a!=0) {
                     largest=a;
                         }
                 }while(a!=0);
        }
       }
    System.out.println("largest number is : "+largest);
    }
}
