
public class added {
    public static int[] runningSum(int [] arr) {
        for(int i=1;i<arr.length;i++) {
            arr[i]= arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] ={3,1,2,10,1};
        runningSum(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
