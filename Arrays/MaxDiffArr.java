import java.util.*;
class MaxDiffArr{
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10,44,5};
        int maxDiff = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int diff = arr[j]-arr[i];
                if(diff>maxDiff){
                    maxDiff = diff;
                }
            }
        }
        System.out.print(maxDiff);
    }
}
     
