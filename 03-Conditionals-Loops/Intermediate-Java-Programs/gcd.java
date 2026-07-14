import java.util.Scanner;
public class gcd {
    public static void main(String args[]) {
        try(Scanner sc= new Scanner(System.in)) {
            System.out.println("enter the numbers");
            int num = sc.nextInt();
            int num1 = sc.nextInt();
            int a=num,b=num1;
            while(a!=0&&b!=0) {
                int temp=a;
                a=a%b;
                b=temp;
                
            }
            System.out.println(a);
        }
    }

}

