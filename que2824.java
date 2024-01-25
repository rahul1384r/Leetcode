public class que2824 {
    public static void main(String[] args) {
        int arr[]={-6,2,5,-2,-7,-1,3};
        int count=0;
        int target=-2;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]<target){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}
