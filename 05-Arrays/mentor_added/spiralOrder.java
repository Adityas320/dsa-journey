import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
    public static List<Integer> spirals (int arr[][]) {
        List<Integer> list = new ArrayList<>();
        if(arr.length==0) {
            return list;
        }
        int top = 0,down = arr.length-1,left=0,right=arr[0].length-1;

        while (top<=down && left<= right) {
            for(int i=left;i<=right;i++) {
                list.add(arr[top][i]);
            }
            top ++;
            for(int i=top;i<=down;i++) {
                list.add(arr[i][right]);
            }
            right--;
            if (top <= down) {
                
            for(int i=right;i>=left;i--) {
                list.add(arr[down][i]);
            }
        }
            down--;
            if(right>=left) {
            for(int i=down;i>=top;i--) {
                list.add(arr[i][left]);
            }
        }
            left++;
        }
        return list;

    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr1[][]={{1,2,3}};
        int arr2[][]={{1},{4},{7}};
        List <Integer> list = spirals(arr);
        System.out.println(list);
        List <Integer> list1 = spirals(arr1);
        System.out.println(list1);
        List <Integer> list2 = spirals(arr2);
        System.out.println(list2);
    }
}