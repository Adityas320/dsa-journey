public class HighestAltitude {
    public static int highest(int altitude,int arr[]) {
        int max=altitude;
        for(int i=0;i<arr.length;i++) {
            if(i>0) {
                altitude= arr[i-1];
            }
            arr[i]=arr[i]+altitude;
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] ={-5,1,5,0,-7};
        int a =0;
        System.out.println(highest(a, arr));
    }
}