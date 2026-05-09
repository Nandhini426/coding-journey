import java.util.*;
public class PalindromeString {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().toLowerCase().trim();
        int start = 0, end=str.length() - 1;
        char[] arr = str.toCharArray();
        while(start<end){
            if(arr[start]!=arr[end]){
                System.out.println("Not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome");
    }
}
