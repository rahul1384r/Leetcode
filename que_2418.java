public class que_2418 {
    public static void main(String[] args) {
        String arr[]={"Mary","John","Emma","RRY"};
        int height[]={180,165,190};
        for(int i=0;i<arr.length;i++){
            // int maxHeight=height[0];
            for(int j=i+1;j<height.length;j++){
                if(height.length)
                if(height[j]>height[i]){
                    String temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
