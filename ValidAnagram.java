import java.util.*;  //when lowercase and uppercase mixed, fr flexibility
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
public boolean isAnagram(String s,String t){
    if(s.length()!=t.length()) return false;
    int[] count = new int[26];
    for(char c : s.toCharArray()){
        count[c-'a']++;
    }
    for(char c : t.toCharArray()){
        count[c-'a']--;
    }
    for(int num : count){
        if(num != 0){
            return false;
        }
    }
    return true;
}


//much optimized one
public boolean isAnagram(String s, String t) {
   if(s.length()!=t.length()) return false;

   int[] count = new int[26];

   for(int i=0;i<s.length();i++){
      count[s.charAt(i) - 'a']++;
   }

   for(int i=0;i<t.length();i++){
      count[t.charAt(i) - 'a']--;

      if(count[t.charAt(i) - 'a']<0){
          return false;
      }
   }
   return true;
}