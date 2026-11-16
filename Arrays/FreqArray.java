import java.util.Arrays;
import java.util.*;
class FreqArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,8,5,1,2,4,4,6,5,7,8,9,1,2,3,4,5,6,7,8,9};
        int freq[] = new int[10];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            System.out.println(i + ": " + freq[i]);
        }
        System.out.print(Arrays.toString(freq));
    }
}