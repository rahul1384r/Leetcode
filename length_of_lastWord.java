public class length_of_lastWord {
    public static void main(String[] args) {
        String s="luffy is still joyboy ";
        int len=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                len=s.length()-i-1;
                break;
            }
            if(s.charAt(i==' ' && s.charAt(i+1)))
        }
        System.out.println(len);
    }
}
