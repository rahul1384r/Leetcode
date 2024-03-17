public class que_2176 {
    public static void main(String[] args) {
        int arr[]={3,1,2,2,2,1,3};
        int k=2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                    if((i*j)%2==0){
                        count++;
                    }
               }              
            }
        }
        System.out.println(count);
    }
    
}
