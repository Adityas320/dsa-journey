/*
 * Question 8
 *
 * To find out whether the given String is Palindrome or not.
 */
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        int i,j;
        boolean ispallindrome = true;
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String word= sc.next();
        for(i=0,j=word.length()-1;i<j;i++,j--) {
            if(word.charAt(i)==word.charAt(j)) {
                continue;
            }
            else {
                ispallindrome=false;
                break;
            }
        }
        if(ispallindrome) {
            System.out.println("it is pallindrome");
        }
        else{
            System.out.println("it is not a pallindrome");
        }
        sc.close();
    }
}
