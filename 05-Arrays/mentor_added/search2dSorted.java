public class Search2dSorted {
    // public static boolean searchMatrix(int[][] matrix, int target) {
    //     //Left to right, yes. And there's a second half that makes it safe: if the left side of || is already true, Java doesn't evaluate the right side at all. The result can't change, so it skips it. That's called short-circuit evaluation. On new int[0][0], matrix.length==0 is true, so matrix[0] is never touched. Swap the order and Java reaches for matrix[0] first, and it crashes before the guard can protect you. So the order of the checks is part of the guard's correctness, not style.
    //     if(matrix[0].length==0||matrix.length==0) {
    //         System.out.println("not valid matrix");
    //         return false;
    //     }
    //     int row=-1;
    //     int i=0;
    //         for(int j=0;j<matrix.length;j++) {
    //             if(target>=matrix[j][i]) {
    //                 if(target==matrix[j][i]) {
    //                     return  true;
    //                 }
    //                 if(j==matrix.length-1) {
    //                     if(target<=matrix[j][matrix[j].length-1]) {
    //                         row = j;
    //                     }
    //                     else {
    //                         return false;
    //                     }
    //                 }
    //                 continue;
    //             } else{
    //                 if(j==0) {
    //                 return  false;
    //                 }else {
    //                 row=j-1;
    //                 }
    //                 break;
    //             }
        //     }
        //     for( i=0;i<matrix[row].length;i++) {
        //           if (target==matrix[row][i]) {
        //              return true;
        //                 }
        // }  
        // return false;



        public static boolean searchMatrix(int[][] matrix, int target) {
            if(matrix.length==0||matrix[0].length==0) {
                return false;
            }
            int a=0,mid;
            int b= (matrix.length*matrix[0].length)-1;
            while(b>=a){
                mid=(a+b)/2;
                int first,second;
                 first=mid/matrix[0].length;
                 second = mid% matrix[0].length;
                
                if(matrix[first][second]>target) {
                    b=mid-1;
                }else if(matrix[first][second]<target) {
                    a=mid+1;
                }else {
                    return true;
                }
            }
            return false;

        }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] arr1={{1,3,5}};
        int[][] arr2={{1},{2},{3},{4}};
        int[][] arr3={{}};
         System.out.println("target 0 "+searchMatrix(arr, 2));
         System.out.println("target 1 "+searchMatrix(arr, 1));
         System.out.println("target 10 "+searchMatrix(arr, 10));
         System.out.println("target 16 "+searchMatrix(arr, 16));
         System.out.println("target 5 "+searchMatrix(arr, 5));
         System.out.println("target 12 "+searchMatrix(arr, 12));
         System.out.println("target 4 "+searchMatrix(arr, 4));
        
         System.out.println("target 3 in one row "+searchMatrix(arr1, 3));
         System.out.println("target 1 in one row "+searchMatrix(arr1, 1));
         System.out.println("target 4 in one row "+searchMatrix(arr1, 4));

         System.out.println("target 1 in 4 column "+searchMatrix(arr2, 1));
         System.out.println("target 4 in 4 column "+searchMatrix(arr2, 4));
         System.out.println("target 5 in 4 column "+searchMatrix(arr2, 5));
         System.out.println("target 5 in empty "+searchMatrix(arr3, 5));
        
    }
}