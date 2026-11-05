import java.util.*;
import java.util.Arrays; 
class RightShift{
    public static void main(String[] args){
        int[] arr = {12,14,16,18,20,22};
        int last = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        System.out.println(Arrays.toString(arr));
    }
}