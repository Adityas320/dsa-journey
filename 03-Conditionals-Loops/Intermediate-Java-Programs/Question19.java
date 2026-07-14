/*
 * Question 19 - Intermediate Java Programs
 *
 * HCF Of Two Numbers Program
 */
import java.util.Scanner;
public class Question19 {
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the 2  numbersr");
            int num=sc.nextInt();
            int num1=sc.nextInt();
            int smaller;
            int hcf=1;
            if(num1==num) {
                System.out.println("the hcf is : "+num);
                return;
            }
            if(num1>num) {
                smaller=num;
            }
            else {
                smaller=num1;
            }
            for(int i=2;i<=smaller;i++) {
                int first=1,second=1;
                if(num%i==0){
                    first=i;
                    num=num/i;
                } 
                if(num1%i==0) {
                     second=i;
                     num1=num1/i;
                }
                if(first==second && first!=1) {
                    i=1;
                    hcf=hcf*first;
                    
                }

            }
            System.out.println(hcf);
        }
    }
}
