public class PascalCase {
    public static int  nearest(int[] arr,int target) {
        if(arr.length==0 || arr[arr.length-1]<target) {
            return -1;
        }
        int a=0,b=arr.length-1;
        while(b>=a) {
            int mid = (a+b)/2;
            if(arr[mid]==target) {
                return arr[mid];
            }
            else if(arr[mid]>target) {
                b=mid-1;
            }
            else {
                a=mid+1;
            }
         } 
            return arr[a];
}
public static void main(String[] args) {
        int[] arr={2,5,6,12,16,23,38,56,72,91};
        int[] arr1={1};
        System.out.println("target 16 "+nearest(arr, 16));
        System.out.println("target 13 "+nearest(arr, 13));
        System.out.println("target 2 "+nearest(arr, 2));
        System.out.println("target 92 "+nearest(arr, 92));
        System.out.println("target 1 "+nearest(arr, 1));

        System.out.println("target 1 in single element "+nearest(arr1, 1));
        System.out.println("target 2 in single elemnt "+nearest(arr1, 2));
    }
}
