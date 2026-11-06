import java.util.*;
import java.util.Arrays;
class BinarySearch{
    public static void main(String[] args){
        int[] arr = {12,2,14,3,5,8,45,75,12,4,6,7,9};
        int target =12;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        int high = arr.length-1;
        int low = 0;
        int foundIndex = -1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                foundIndex = mid;
                break;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println("Found at index: "+foundIndex);
    }
}