public class spiral {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int i=0;
            for(int j=0;j<arr.length;j++) {
                System.out.println(arr[i][j]);
            }
        int j=2;
            for(i=1;i<arr.length;i++) {
                System.out.println(arr[i][j]);
            }
        i=2;
            for(j=1;j>=0;j--) {
                System.out.println(arr[i][j]);
            }
        i=1;
            for( j=0;j<arr.length-1;j++) {
                System.out.println(arr[i][j]);
            }
        
        
    }
    
}