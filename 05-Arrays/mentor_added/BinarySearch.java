public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        if(arr.length==0) {
            return -1;
        }
        int a=0;
        int b=arr.length-1;
        while (b>=a) {
            int mid = (a+b)/2;
            if(arr[mid]== target) {
                return mid;
            }else if(target>arr[mid]) {
                mid++; // this is not proper way the down one is proper way 
                a=mid;
            }else {
                //since mid is a variable we dont edit mid here 
                b=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,8 ,12, 16, 23, 38, 56, 72, 91};
        int [] arr1 = {2,5};
        System.out.println(binarySearch(arr1, 2));
        System.out.println(binarySearch(arr1, 5));
        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 8));
        System.out.println(binarySearch(arr, 12));
        System.out.println(binarySearch(arr, 16));
        System.out.println(binarySearch(arr,23));
        System.out.println(binarySearch(arr, 38));
        System.out.println(binarySearch(arr, 56));
        System.out.println(binarySearch(arr, 72));
        System.out.println(binarySearch(arr,91));
        System.out.println(binarySearch(arr, 0));
        System.out.println(binarySearch(arr, 100));
    }
    
}
