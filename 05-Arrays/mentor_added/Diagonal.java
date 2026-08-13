import java.util.Arrays;

public class Diagonal {
    public static int[] diagonal(int arr[][]) {
        int brr[]= new int [arr.length];
        for(int i=0;i<arr.length;i++) {
            brr[i]=arr[i][i];
        }
        return brr;
    }
    public static int[] antidiagonal(int arr[][]) {
        int brr[]= new int[arr.length];
        for(int j=0,i=arr.length-1;i>=0;j++,i--) {
            brr[j]=arr[j][i];
        }
        return brr;
    }
    public static void main(String[] args) {
        int [][] brr={{1,2,3},{4,5,6},{7,8,9}};
        int drr[]=diagonal(brr);
        int crr[]=antidiagonal(brr);
        System.out.println(Arrays.toString(drr));
        System.out.println(Arrays.toString(crr));

    }
    
}
