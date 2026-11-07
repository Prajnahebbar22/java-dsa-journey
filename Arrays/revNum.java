import java.util.*;
class revNum{
    public static void main(String[] args){
        int n=1452;
        int rev = 0;
        if(n==0){
            rev = 0;
        }
        while(n>0){
            int digit = n %10;
            rev = digit+rev*10;
            n = n /10;
        }
        System.out.print(rev);
    }
}