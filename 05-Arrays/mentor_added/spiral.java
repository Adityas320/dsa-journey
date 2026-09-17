import java.util.List;
import java.util.ArrayList;
public class spiral {
    public static List<Integer> spiral(int [][] matrix) {
        List<Integer> list = new ArrayList<>();
        int k;
        int left=0,right= matrix[0].length-1,bottom=matrix.length-1,top =0;
        while (top<=bottom && left <= right) {  
        for(k=left;k<=right;k++) {
            list.add(matrix[top][k]);
        }
        top++;
        for(k=top;k<=bottom;k++) {
            list.add(matrix[k][right]);
        }
        right--;
        for(k=right;k>=left;k--) {
            list.add(matrix[bottom][k]);
        }
        bottom--;
        for(k=bottom;k>=top;k--) {
            list.add(matrix[k][left]);
        }
        left++;
    }
    return list;
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1 ={{1,2,3},{4,5,6}};
        //i stays same j increases j went till 2
        // int i=0;
        //     for(int j=0;j<arr.length;j++) {
        //         System.out.println(arr[i][j]);
        //     }
        //     // j stays same i increases to 2
        // int j=2;
        //     for(i=1;i<arr.length;i++) {
        //         System.out.println(arr[i][j]);
        //     }
        //     // i stays same j decreases to 0
        // i=2;
        //     for(j=1;j>=0;j--) {
        //         System.out.println(arr[i][j]);
        //     }
        //     // j stays the same i decreases
        // j=0;
        //     for( i=1;i>0;i--) {
        //         System.out.println(arr[i][j]);
        //     }
        List<Integer> values =  spiral(arr);
        System.out.println(values);
        List<Integer> values1 =  spiral(arr1);
        System.out.println(values1);
        
        
    }
    
}