import java.util.*;
public class SecondLargest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>first){
                second = first;
                first = num;
            }
            else if(num>second && num!=first){
                second = num;
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("No second largest element");
        }else{
            System.out.println("Second Largest: "+second);
        }
    }
}
