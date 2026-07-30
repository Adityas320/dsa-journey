/*
 * Question 3 - Easy
 *
 * Kids With the Greatest Number of Candies
 *
 * Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class Question3 {
    public static boolean[] ListofCandies(int a,int arr[]) {
        boolean[] brr= new boolean[arr.length];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]+a>=max) {
                brr[i]=true;
            }
        }
        return brr;
    }
    public static void main(String[] args) {
        // TODO: implement solution
        int arr[]={2,3,5,1,3};
        int extra =4;
       boolean brr[]= ListofCandies(extra, arr);
       for(int i=0;i<brr.length;i++) {
        System.out.println(brr[i]);
       }
        
    }
}
