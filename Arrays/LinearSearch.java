import java.util.*;
class LinearSearch{
    public static void main(String[] args){
        int[] arr = {1,12,2,3,4,7,8};
        int target = 12;
        int foundIndex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                foundIndex = i;
            }
        }
        System.out.println(foundIndex);
    }
}