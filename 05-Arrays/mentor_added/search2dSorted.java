public class search2dSorted {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=-1;
        int i=0;
            for(int j=0;j<matrix[i].length;j++) {
                if(target>=matrix[j][i]) {
                    if(target==matrix[j][i]) {
                        return true;
                    }
                    if(j==matrix.length-1) {
                        if(target<=matrix[j][matrix[j].length-1]) {
                            row = j;
                        }
                        else {
                            return false;
                        }
                    }
                    continue;
                } else{
                    row=j-1;
                    break;
                }
            }
            for( i=0;i<matrix[row].length;i++) {
                if (target==matrix[row][i]) {
                    return true;
                }
            else {
                return false;
            }
        }  
    }

    public static void main(String[] args) {
        
    }
}