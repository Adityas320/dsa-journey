/*
 * Question 24 - Intermediate Java Programs
 *
 * Sum Of A Digits Of Number
 */
import java.util.Scanner;
public class Question24 {
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc= new Scanner(System.in)) {
            System.out.println("enter the number");
            int num = sc.nextInt();
            int temp=num;
            int count=0;
            int sod=0;
            while(temp>0)  {
                int temp1= temp%10;
                temp=temp/10;
                sod=sod+temp1;
                count++;
            }
            System.out.println("the sum of digits is : "+sod+" and digits  : "+count);
        }
    }
}
