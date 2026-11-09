import java.util.*;
class MissnNum{
    public static void main(String[] args){
        int n=5;
        int[] arr = {1,2,3,4};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int totsum = n*(n+1)/2;
        int result = totsum - sum;
        System.out.println(result);
    }
}