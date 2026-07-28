public class LinearSearch {
    public static int  Linearsearch(int arr[],int n) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==n) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,13,14,15};
        System.out.println(Linearsearch(arr, 14));
    }
}
