import java.util.*;
class FirstNR{
    public static void main(String[] args){
        String str = "aabbcd";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }
    }
}