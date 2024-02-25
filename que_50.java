import java.util.Scanner;

public class que_50 {
    public static float power(int n,int pow){
        if(pow==0){
            return 1;
        }
        float fnm1=0;
        if(pow>=0){
            if(pow==1){
                return n;
            }
            return n*power(n, pow-1);
        }
        else{
            fnm1=n*power(n,pow+1);
            
        }
        return 1/fnm1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pow=sc.nextInt();
        float res=1/power(n, pow);
        System.out.println(res);
    }
}
