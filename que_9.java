import java.util.Scanner;
public class que_9{
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=z.nextInt();
        int rev=0;
        int num=x;
        if(x<0){
            System.out.println("false");
        }
        while(x>0){
            rev=(rev*10)+(num%10);
            num/=10;
        }
        if(num==rev){
            System.out.println("ture");
        }
        else{
            System.out.println("fall");
        }


    }
}   