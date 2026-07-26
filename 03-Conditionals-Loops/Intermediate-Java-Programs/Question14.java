/*
 * Question 14 - Intermediate Java Programs
 *
 * Armstrong Number In Java
 */

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        // TODO: implement solution
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range");
        int number=sc.nextInt();
        int number2=sc.nextInt();
        boolean isarmstrong=false;
        for(int i=number;i<=number2;i++) {
        int temp=i;
        int temp1=temp;
        int digits=0;
        int tempnum=0;
        while(temp>0) {
            temp=temp/10;
            digits++;
        }
        while(temp1>0) {
            int a=temp1%10;
            temp1=temp1/10;
            int c=1;
            for(int j=0;j<digits;j++) {
                 c=c*a;
            }
            tempnum=tempnum+c;
        }
        if(i==tempnum) {
            isarmstrong=true;
            System.out.println(i+" is an armstrom number");
        }
        else {
            continue;
        }
        }
        if(isarmstrong==false) {
            System.out.println("no numbers in the range ");
        }
        sc.close();
    }
}
