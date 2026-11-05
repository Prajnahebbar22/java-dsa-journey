import java.util.*;
import java.util.Arrays;
class KShift{
    public static void reverse(int[] arr,int low,int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void rearrange(int[] arr,int k){
        int n = arr.length;
        if(n==0){
            return ;
        }
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void main(String[] args){
        int[] stops = {12,14,16,18,20,22};
        int k=3;
        rearrange(stops,k);
        System.out.println(Arrays.toString(stops));
    }
}