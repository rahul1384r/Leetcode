public class que_28 {
    public static void main(String[] args) {
        String str="mississippi";
        String sub="issip";
        for(int i=0;i<str.length();i++){
            if(str.contains(sub)){
                if(sub.charAt(0)==str.charAt(i) && sub.charAt(sub.length())==str.charAt(i)){
                    System.out.println(i);
                }
            }
            else{
                System.out.println(-1);
                break;
            }
        }
    }
}
