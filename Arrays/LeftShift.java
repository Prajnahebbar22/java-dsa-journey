import java.util.*;
import java.util.Arrays;class LeftShift{
    public static void main(String[] args){
        int[] arr = {12,14,16,18,20,22};
        int first = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
        System.out.println(Arrays.toString(arr));
    }
}