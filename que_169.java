public class que_169 {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,2,2};
        int count=0;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                if(j==1){
                    if(arr[j]==arr[i-1]){
                        break;
                    }
                }
                if(arr[i]==arr[j]){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
