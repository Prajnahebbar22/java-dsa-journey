import java.util.*;
class SecondOcc{
    public static void main(String[] args){
        String str = "programming";
        char target = 'r';
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                count++;
                if(count==2){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}