public class que_2960 {
    public static void main(String[] args) {
        int arr[]={0,2,1,4};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                break;
            }
            count+=1;
            for(int j=i+1;j<arr.length;j++){
                    arr[j]=arr[j]-1;
                    count+=1;
            }
        }
        System.out.println(count);        
    }
}
