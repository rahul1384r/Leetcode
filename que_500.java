public class que_500 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]=new int[arr1.length];
        arr2[0]=arr1[0];
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
