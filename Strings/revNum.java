import java.util.*;
class revNum{
    public static void main(String[] args){
        String n = "1200";
        String rev = "";
        for(int i = n.length()-1;i>=0;i--){
            rev+=n.charAt(i);
        }
        System.out.println(rev);

    }
}
