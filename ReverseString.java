import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] arr = str.toCharArray();
        int start = 0,end = arr.length - 1;
        while(start<end){
            char t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;

            start++;
            end--;
        }
        System.out.println(new String(arr));
    }
}
