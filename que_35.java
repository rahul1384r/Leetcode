public class que_35 {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int target=2;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println(mid);
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println(start);
    }
}
