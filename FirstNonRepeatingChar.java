import java.util.*;
public class FirstNonRepeatingChar{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int []freq = new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i) - 'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)-'a']==1){
                System.out.println("First Non-Repeating Character: "+str.charAt(i));
                return;
            }
        }
        System.out.println("No non-repeating character");
    }
}