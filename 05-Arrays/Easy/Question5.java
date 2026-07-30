/*
 * Question 5 - Easy
 *
 * How Many Numbers Are Smaller Than the Current Number
 *
 * Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
// n2 we want n we will try 
public class Question5 {
    public static int[] smaller(int arr[]) {
        int counting[]= new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            int count =0;
            for(int j=0;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    count++;
                }
            }
            counting[i]=count;
        }
        return counting;
    }
    public static void main(String[] args) {
        // TODO: implement solution
        int arr []={8,1,2,2,3};
       int brr[]= smaller(arr);
        for(int i=0;i<brr.length;i++) {
            System.out.println(brr[i]);
        }
    }
}
