import java.util.Scanner;

public class reverseInteger {
  public static void main(String args[]){
    try(Scanner sc = new Scanner (System.in)) {
        System.out.println("enter the number you want to reverse ");
        int num = sc.nextInt();
        int temp=num;
        int reversedInteger=0,digits;
        while(temp>0) {
            digits=temp%10;
            temp=temp/10;
            reversedInteger= reversedInteger*10 +digits;
        }
        System.out.println(reversedInteger);
    }
  }  
}
