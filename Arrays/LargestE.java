import java.util.*;
class LargestE{
    public static void main(String[] args){
        int[] arr = {12,41,5,78,56,89,45,67,90,34};
        int largest = arr[0];
        for(int num:arr){
            if(num>largest){
                largest = num;
            }
        }
        System.out.println(largest);
    }
}