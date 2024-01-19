import java.util.*;
//Linear Search
public class Main
{
    public static int LinearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key) {
                return i;
            }
        }
        return -1;
    } 
	public static void main(String[] args) {
	    int numbers[]={2,3,4,5,6,7,8,55,75,678};
	    int key=6;
	    int index = LinearSearch(numbers,key);
	    if(index == -1){
	        System.out.println("NOT FOUND");
	    }
	    else {
	    System.out.println("key is at index: "+ index);
	}
}
}