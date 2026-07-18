/*
 * Question 22 - Intermediate Java Programs
 *
 * Perfect Number In Java
 */
import java.util.Scanner;
public class Question22 {
    static void perfectNumber (int a){
        int temp = a;
        int sum =0;
        for(int i=1;i<a;i++) {
            if(temp%i==0) {
                sum=sum+i;
            }
        }
        if(sum==a) {
            System.out.println("yes it is");
        }else{
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        // TODO: implement solution
        System.out.println("Enter the number");
        try(Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            perfectNumber(num);
        }
    }
}
