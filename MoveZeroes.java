public class MoveZeroes {
    public static void moveZeroes(int[] nums) {

        int j = 0; // position for next non-zero

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // fill remaining with 0
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
}