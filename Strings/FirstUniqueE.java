import java.util.*;
class FirstUniqueE{
    static char dup(String str){
        for(int i=0;i<str.length();i++){
            boolean unique = true;
            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    unique = false;
                    break;
                }
            }
            if(unique){
                return str.charAt(i);
            }
        }
        return '\0';
    }
    public static void main(String[] args){
        String str = "Java";
        char result = dup(str);
        if(result !='\0'){
            System.out.println("First unique character is: "+result);
        }else{
            System.out.println(result);
        }
    }
}