import java.util.Scanner;
public class fizzbuzz {
    public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
    for(int i=1;i<=num;i++) {
        if(i%3==0&&i%5==0) {
            System.out.println("FizzBuzz");
            continue;
        }
        if(i%3==0) {
            System.out.println("Fizz");
            continue;
        }
        if(i%5==0) {
            System.out.println("Buzz");
            continue;
        }
        else {
            System.out.println(i);
        }
    }
    }
}
