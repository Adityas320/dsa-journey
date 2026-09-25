public class FloorOfNumber {
    public static int floor(int[] arr , int target) {
        if(arr.length==0|| target<arr[0]) {
            return -1;
        }
        int a =0,b=arr.length-1;
        while(b>=a) {
            int mid =(a+b)/2;
            if(arr[mid] == target) {
                return arr[mid];
            }
            else if(arr[mid]<target) {
                a=mid+1;
            }
            else {
                b=mid-1;
            }
        }
        return arr[b];
    }

        public static void main(String[] args) {
        int[] arr={2,5,6,12,16,23,38,56,72,91};
        int[] arr1={1};
        System.out.println("target 16 "+floor(arr, 16));
        System.out.println("target 13 "+floor(arr, 13));
        System.out.println("target 2 "+floor(arr, 2));
        System.out.println("target 92 "+floor(arr, 92));
        System.out.println("target 1 "+floor(arr, 1));

        System.out.println("target 1 in single element "+floor(arr1, 1));
        System.out.println("target 2 in single elemnt "+floor(arr1, 2));
    }
}
