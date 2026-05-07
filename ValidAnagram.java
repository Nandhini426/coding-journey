import java.util.*;
public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        Map<Character,Integer> map = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c,map.get(c)-1);

            if(map.get(c)<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaramm";

        System.out.println(isAnagram(s, t));
    }
}


//using array
public static boolean isAnagram(String s,String t){
    int[] count = new int[26];
    if(s.length()!=t.length()){
        return false;
    }
    for(char c:s.toCharArray()){
       [count - 'a']++;
    }

    for(char c:t.toCharArray()){
        [count - 'a']--;
    }
    if([count - 'a']<0){
        return false;
    }
    return true;
}