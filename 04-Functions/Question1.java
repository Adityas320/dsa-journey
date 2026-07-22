/*
 * Question 1
 *
 * Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
 *
 * Link: https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html
 */
import java.util.Scanner;
public class Question1 {
    static int maximum1(int a,int b,int c){
            int max = a;
             if (b > max) max = b;
                if (c > max) max = c;
                return max;

    }
        static int minimum2(int a,int b,int c){
            int min = a;
             if (b < min) min = b;
                if (c < min) min = c;
                return min;

    }
    static int maximum(int a, int b, int c) {
        if(a>b) {
            if(a>c) {
                return a;
            } else {
                return c;
            }
        }if(b>c) {
            return b;
        } else {
            return c;
        }
    }
    static int minimum(int a,int b,int c) {
        if(a<b) {
            if(a<c) {
                return a;
            } else {
                return c;
            }
        }
        if(b<c) {
            return b;
        }else {
            return c;
        }
    }
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println(maximum1(12, 13, 14));
            System.out.println(minimum2(12, 13, 14));
        }
    }
}
