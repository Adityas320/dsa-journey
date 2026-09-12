
public class SecondLargest {

    public static int secondLarge(int [] arr , int whichlargest) {
        if (whichlargest > arr.length || whichlargest < 1) throw new IllegalArgumentException("...");
        boolean brr[]=  new boolean[arr.length];
        int largest=arr[0];
         
        for(int j=0;j<whichlargest;j++) {
            largest =Integer.MIN_VALUE;
            int largestiter=-1;
        for(int i=0;i<arr.length;i++) {
            if(brr[i]==false) {
            if(arr[i]>largest) {
                largest = arr[i];
                largestiter=i;
            }
        }
        //System.out.println(largest);
        }
        if(largestiter!=-1) {
        brr[largestiter]=true;
        }   
    }
    return largest;
    }
    public static void main(String[] args) {
        int [] arr= {6,2,3,4,5};
        System.out.println(secondLarge(arr, 2));

    }
    
}
