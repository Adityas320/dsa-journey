public class permutedarray {
    public static void main(String[] args) {
        int nums[]={0,2,1,5,3,4};
        int arr[]= new int [nums.length];
        for(int i=0;i<arr.length;i++) {
            arr[i]=nums[nums[i]];
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
 
    

    
}
