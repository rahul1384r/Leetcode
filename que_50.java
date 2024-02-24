import java.util.Scanner;

public class que_50 {
    public static double power(int n,int pow){
        if(pow==0){
            return 1;
        }
        double fnm1=0;
        double fnm2=0;
        if(pow>=0){
            if(pow==1){
                return n;
            }
            return n*power(n, pow-1);
        }
        else{
            fnm1=power(1/n, 1/(pow+1));
            fnm2=(1/n)*fnm1;
        }
        return fnm2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pow=sc.nextInt();
        System.out.println(power(n, pow));
    }
}
