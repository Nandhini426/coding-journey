import java.util.*;
public class containsduplicate {
    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,2,4,1};
        System.out.println(containsDuplicate(nums));
    }
}
