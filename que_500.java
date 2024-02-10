public class que_500 {
    // qwertyuiop--> 10
    // asdfghjkl---> 9
    // zxcvbnm--> 7
    public static void main(String[] args) {
        String arr[]={"hello","alaska","dad","peace"};
        int count_1=0;
        int count_2=0;
        int count_3=0;
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            if(str.charAt(i)=='q' || str.charAt(i)=='w' || str.charAt(i)=='e' || str.charAt(i)=='r' || str.charAt(i)=='t' || str.charAt(i)=='y' || str.charAt(i)=='u' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='p'){
                count_1++;
            }
            if(str.charAt(i)=='q' || str.charAt(i)=='w' || str.charAt(i)=='e' || str.charAt(i)=='r' || str.charAt(i)=='t' || str.charAt(i)=='y' || str.charAt(i)=='u' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='p'){
                count_2++;
            }
            if(str.charAt(i)=='q' || str.charAt(i)=='w' || str.charAt(i)=='e' || str.charAt(i)=='r' || str.charAt(i)=='t' || str.charAt(i)=='y' || str.charAt(i)=='u' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='p'){
                count_3++;
            }
        }
        if(count_1!=0 && count_2!=0 && count_3!=0){
            System.out.println("["+"]");
        }
        
    }
}
