public class que_4 {
    public static void main(String[] args) {
        int nums1[]={1,3,4,5};
        int nums2[]={2,7,8};
        int n=nums1.length+nums2.length;
        int arr[]=new int[n];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]<nums2[j]){
                    arr[i]=nums1[i];
                }
                else if(nums1[i]>nums2[j]){
                    arr[i]=nums2[j];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
