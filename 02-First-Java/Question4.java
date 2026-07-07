/*
 * Question 4
 *
 * Take in two numbers and an operator (+, -, *, /) and calculate the value.
 * (Use if conditions)
 */
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("enter the number 1 : ");
     int num1=sc.nextInt();
     System.out.print("enter the number 2 : ");
     int num2=sc.nextInt();
     System.out.print("enter the calculation you want to perform + - * /");
     char operator = sc.next().charAt(0);
     if(operator=='+') {
        System.out.println(num1+num2);
     }
     else if (operator == '-') {
        System.out.println(num1-num2);
     }
     else if(operator == '*') {
        System.out.println(num1*num2);
     }
     else if(operator == '/') {
        System.out.println(num1/num2);
    }
    else {
        System.out.println("thankyou");
    }
    sc.close();
}
    
}
