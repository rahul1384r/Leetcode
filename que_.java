public class que_ {
    public static void main(String[] args) {
        int[] arr={2,2,1};
        for(int i=0;i<arr.length;i++){
            arr[0] ^= arr[i];
        }
        System.out.println(arr[0]);
    }
}
