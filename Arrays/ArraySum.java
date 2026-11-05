import java.util.*;
class ArraySum{
    public static void main(String[] args){
        int[] arr = {12,14,58,23,56, 89,45,67,90,34};
        int sum = 0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }
}