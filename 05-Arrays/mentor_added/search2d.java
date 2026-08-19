import java.util.Arrays;
//int[][] matrix = new int[0][0]; is a completely legal Java array. It has zero rows. matrix.length is 0. There is no row 0, so matrix[0] throws ArrayIndexOutOfBoundsException before you ever touch a value.

//Same for {{}} — one row, but that row is empty. matrix[0] exists, matrix[0][0]
public class search2d{
    public static int max(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("matrix must not be empty");
        }
        int max= matrix[0][0];
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(matrix[i][j]>max) {
                    max=matrix[i][j];
                }
            }
        }
        return max;
    }
    public static int[] search (int [][] matrix,int target) {
        for(int i=0;i<matrix.length;i++) {
            
            for(int j=0;j<matrix[i].length;j++) {
                if(matrix[i][j]== target) {
                    int arr[]={i,j};
                    return arr;
                }
            }
        }
            int arr[]={-1,-1};
            return arr;
        }

    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(max(arr));
        System.out.println(Arrays.toString(search(arr, 10)));
    }
}