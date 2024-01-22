public class que_27 {
    public static void main(String[] args) {
        int[] arr={2,2,2,3};
        int target=2;
        for(int i=1;i<arr.length;i++){
            arr[0]^=arr[i];
        }
        System.out.println(arr[0]);
    }
}
