public class que_31 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int p=0;
        for(int i=arr.length-2;i>=0;i++){
            if(arr[i]<arr[i+1]){
                p=1;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i++){
            if(arr[i]>arr[p]){
                int temp=arr[i];
                arr[i]=arr[p];
                arr[p]=temp;
                break;
            }
        }
    }
}
