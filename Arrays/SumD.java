import java.util.*;
class SumD{
    public static void main(String[] args){
        int n = 5642;
        int sum = 0;
        if(n==0){
            sum = 0;
        }
        while(n>0){
            int digit = n %10;
            sum  +=digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}