
public class richest {
    public static void main(String[] args) {
        int accounts[][]={{1,2,3},{2,1,4},{1,6,1}};
        int sum;
        int richest=0;
        int cusnumber=0;
        for(int i=0;i<accounts.length;i++) {
            sum=0;
            for(int j=0;j<accounts[i].length;j++) {
                sum=sum+accounts[i][j];
            }
            if(sum>richest) {
                richest=sum;
                cusnumber=i;
            }
        }
        System.out.println("the richest customer is : "+ cusnumber+" with wealth "+richest);
    }
}
