import java.util.Arrays;

public class ReverseMatrix {
    public static void rotate(int[][] matrix) {
        int[][] arr = new int[matrix.length][];
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                arr[i][j]=matrix[j][i];
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void rotate(int []arr) {
        int brr[]= new int[arr.length];
        for(int i=0,j=arr.length-1;i<arr.length;i++,j--) {
            brr[j]=arr[i];
        }
        System.out.println(Arrays.toString(brr));
    }
    public static void main(String[] args) {
        int [][] brr={{1,2,3},{4,5,6},{7,8,9}};
        //rotate(brr);
        int[] arr={1,2,3};
        rotate(arr);
    }
    
}
