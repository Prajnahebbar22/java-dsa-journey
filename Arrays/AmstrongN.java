import java.util.*;
class AmstrongN{
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        int digits = 0;
        int temp = n;
        while(temp>0){
            digits++;
            temp = temp/10;
        }
        while(n>0){
            int digit = n %10;
            sum = sum+ (int) Math.pow(digit,digits);
            n = n/10;
        }
        return sum ==original;
    }
    public static void main(String[] args){
        int n = 153;
        boolean res = isArmstrong(n);
        System.out.println(res);
    }
}