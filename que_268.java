import java.util.*;
public class que_268 {
    public static void main(String[] args) {
        int arr[]={9,6,4,2,3,5,7,0,1};
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            // System.out.print(arr[i]);
            if(i==arr[i]){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
