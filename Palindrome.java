import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = n,rev=0;
        while(n>0){
            int r = n%10;
            rev = rev*10+r;
            n/=10;
        }
        if(n < 0){
           System.out.println("Not a palindrome");
           return;
        }
        if(rev==m){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
