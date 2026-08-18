/*
 * Question 3 - Easy
 *
 * Kids With the Greatest Number of Candies
 *
 * Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
import java.util.List;
import java.util.ArrayList;
public class Question3 {
    public static List<Boolean> ListofCandies(int a,int arr[]) {
        List<Boolean> bool = new ArrayList<>();
        // boolean[] brr= new boolean[arr.length];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]+a>=max) {
                bool.add(true);
            }
            else{
                bool.add(false);
            }
        }
        return bool;
    }
    public static void main(String[] args) {
        // TODO: implement solution
        int arr[]={2,3,5,1,3};
        int extra =4;
        List<Boolean> boo = new ArrayList<>();
        boo=ListofCandies(extra, arr);
       System.out.println(boo);
        
    }
}
