import java.util.*;
import java.util.Arrays;
class LS{
    public static void main(String[] args){
        int[] arr = {12,1,5,4,8,7,9};
        int target = 12;
        int foundIndex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                foundIndex = i;
            }
        }
        System.out.println("Found at index: "+foundIndex);
    }
}