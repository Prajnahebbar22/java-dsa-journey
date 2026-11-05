import java.util.*;
class EvenSum{
    public static void main(String[] args){
        int[] arr = {12,14,89,78,55,46,22};
        int sum=0;
        for(int num:arr){
            if(num%2==0){
                sum+=num;
            }
        }
        System.out.println(sum);
    }
}