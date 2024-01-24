public class que_268 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,7};
        int length=arr.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[j]-arr[i]==1){
                    break;
                }
                else{
                    System.out.println(arr[j]-1);
                }
            }
        }
        
    }
}
