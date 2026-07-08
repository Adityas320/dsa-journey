/*
 * Question 9
 *
 * To find Armstrong Number between two given number.
 */
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 2 numbers ");
        int number=sc.nextInt();
        int numer2=sc.nextInt();
        int temp=number;
        int temp1=temp;
        int digits=0;
        int tempnum=0;
        while(temp>0) {
            temp=temp/10;
            digits++;
        }
        System.out.println(digits);
        while(temp1>0) {
            int a=temp1%10;
            temp1=temp1/10;
            int c=1;
            for(int i=0;i<digits;i++) {
                 c=c*a;
            }
            tempnum=tempnum+c;
        }
        if(number==tempnum) {
            System.out.println("it is armstrom");
        }
        else {
            System.out.println("it is not ");
        }
    }
}
