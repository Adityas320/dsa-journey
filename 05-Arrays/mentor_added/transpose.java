import java.util.Arrays;

public class transpose{
    public static int[][] trans(int [][] arr) {
        int brr[][]= new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                brr[j][i]=arr[i][j];
            }
         }
         return brr;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int brr[][]=trans(arr);
         for(int i=0;i<brr.length;i++) {
            System.out.print("{ ");
            for(int j=0;j<brr[i].length;j++) {
                System.out.print(brr[i][j]+",");
            }
            System.out.print("}");
            System.out.println("");
         }
         System.out.println(Arrays.deepToString(brr));
    }
}