import java.util.*;
class gcd{
    static int gcdN(int a,int b){
        while(b!=0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public static void main(String[] args){
        System.out.println(gcdN(5,8));
    }
}