import java.util.*;
class Anagram{
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";
        String ans = "anagrams";
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        if(a.length!=b.length){
            ans = "NAN";
        }else{
            for(int i = 0;i<=a.length-1;i++){
                for(int j = i+1;j<=a.length-1;j++){
                    if(a[i]>a[j]){
                        char temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            Arrays.sort(b);
        }
        if(Arrays.equals(a,b)){
            ans = "anagrams";
        }else{
            ans = "NAN";
        }
        System.out.println(ans);
    }
}