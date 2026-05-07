import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n<=1){
            System.out.println("NOT PRIME");
            return;
        }
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("PRIME");
        }else{
            System.out.println("NOT PRIME");
        }
    }
}
