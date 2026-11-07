import java.util.*;
class DigitC{
    public static void main(String[] args){
        int n = 3526;
        int count = 0;
        if(n==0){
            count = 0;
        }
        while(n>0){
            int digit = n % 10;
            count++;
            n = n/10;
        }
        System.out.println(count);
    }
}