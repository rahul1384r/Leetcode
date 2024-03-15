public class que_1572 {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                
            }
        }
        int i=0;
        int j=arr[0].length-1;
        while(j<arr[0].length && i<arr[0].length){
            sum+=arr[i][j];
            j--;
            i++;
        }
        // System.out.println(sum);
        if(arr.length%2==0){
            System.out.println(sum);
        }
        else{
            sum-=arr[arr.length/2][arr[0].length/2];
            System.out.println(sum);
        }
    }
}
