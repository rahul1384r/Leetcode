import java.util.Scanner;

public class que_219 {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && Math.abs(i-j)<=k){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            }
        }
    }
}
