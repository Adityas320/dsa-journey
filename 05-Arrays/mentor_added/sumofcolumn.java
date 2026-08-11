import java.util.Arrays;

public class sumofcolumn {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        int brr[]= new int[arr[0].length];
        for(int i=0;i<arr[0].length;i++) {
            int sum =0;
            for(int j=0;j<arr.length;j++) {
                sum = sum + arr[j][i];
            }
            brr[i]=sum;
        }
        System.out.println(Arrays.toString(brr));
    }
    
}
