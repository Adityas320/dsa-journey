/*
 * Question 12
 *
 * Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
 *
 * Link: https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/
 */
import java.util.Scanner;
public class Question12 {
    static void pythaTriplet(int a,int b,int c) {
       int first= square(a);
       int second=square(b);
       int third = square(c);
       if(first + second== third || second + third == first || third+first==second) {
        System.out.println("yes they are triplet");

       }else {
        System.out.println("not a triplet");
       }
    }
    static int square(int n) {
        return n*n;
    }
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            pythaTriplet(a, b, c);
            
        }
    }
}
