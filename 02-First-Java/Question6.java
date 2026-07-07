/*
 * Question 6
 *
 * Input currency in rupees and output in USD.
 */
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        // TODO: implement solution
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value in indian ");
        float indian=sc.nextFloat();
        float us= indian /(float)95.14;
        System.out.println(us + "$");
        sc.close();
    }
}
