import java.util.*;
public class twosum{
    public static int[] twosum(int []nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
               return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return null; // or use: return new int[]{-1,-1};
    }
    

    public static void main(String[] args) {
    int[] nums = {1, 3, 3, 4};
    int target = 6;

    int[] res = twosum(nums, target);
    System.out.println(res[0] + " " + res[1]);
}
}