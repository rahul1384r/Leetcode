public class que_217 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        boolean b=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    b=true;
                }
            }
        }
        System.out.println(b);
    }
}
