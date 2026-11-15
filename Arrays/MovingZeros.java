import java.util.Arrays;
import java.util.*;
class MovingZeros{
    public static void main(String[] args){
        int[] arr = {4,0,2,0,6,0,2,7};
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index] =0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}