import java.util.Scanner;
public class gcd {
static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

static long lcm(int a, int b) {
    return (long) a * b / gcd(a, b);     // reuse gcd!
}

    public static void main(String args[]) {
        try(Scanner sc= new Scanner(System.in)) {
            System.out.println("enter the numbers");
            int num = sc.nextInt();
            int num1 = sc.nextInt();
            System.out.println(gcd(num,num1));
            System.out.println(lcm(num, num1));
        }
    }

}

