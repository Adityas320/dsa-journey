import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseMatrix {

    public static int[][] transpose(int [][] arr) {
        int[][] brr = new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                brr[j][i]=arr[i][j];
            }
        }
            return brr;
    }

    public static int[][] rotate(int [][]arr) {
        int [][] brr = new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++) {
            for(int j=0,k=arr[i].length-1;j<arr[i].length;j++,k--) {
                brr[i][k]=arr[j][i];
            }
        }
        return brr;
    }

    public static int[] reverse(int []arr) {
        int brr[]= new int[arr.length];
        for(int i=0,j=arr.length-1;i<arr.length;i++,j--) {
            brr[j]=arr[i];
        }
        return brr;
    }


    public static void main(String[] args) {
        int [][] crr={{1,2,3},{4,5,6},{7,8,9}};
        // int [][] transposed =transpose(crr);
        int[][] rotated=rotate(crr);
        for(int i=0;i<rotated.length;i++) {
            System.out.println(Arrays.toString(rotated[i]));
        }
        
    }
    
}
