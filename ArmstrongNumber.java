import java.util.*;
public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ori = n;
        int digits = 0,sum =0;
        int temp = n;
        while(temp>0){
            temp/=10;
            digits++;
        }
        temp = n;
        while(temp>0){
            int r = temp%10;
            sum+=Math.pow(r,digits);
            temp/=10;
        }
        if(ori==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
}