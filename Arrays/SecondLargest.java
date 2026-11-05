import java.util.*;
class SecondLargest{
    public static void main(String[] args){
        int[] arr = {12,14,55,87,98,99,1,15};
        int largest = arr[0];
        int SecondL = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                SecondL = largest;
                largest = num;
            }else if(num<largest && num>SecondL){
                SecondL = num;
            }
        }
        System.out.println(SecondL);    
    }
} 
