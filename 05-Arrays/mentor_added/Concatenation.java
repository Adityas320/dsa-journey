public class Concatenation {
    public static int[] concat(int arr[]) {
        int finalarray[]= new int[arr.length*2];
        for(int i=0;i<arr.length;i++) {
            finalarray[i]=arr[i];
            finalarray[i+arr.length]=arr[i];
        }
        return finalarray;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int brr[]=concat(arr);
        for(int i=0;i<brr.length;i++) {
            System.out.println(brr[i]);
        }
    }
}
