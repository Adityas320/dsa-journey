public class HighestAltitude {
public static int highest(int[] arr) {
    int altitude = 0;
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
        altitude = altitude + arr[i];
        if (altitude > max) {
            max = altitude;
        }
    }
    return max;
}

    public static void main(String[] args) {
        int arr[] ={-5,1,5,0,-7};
        System.out.println(highest(arr));
    }
}