package A_Array_and_Hashing;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[] { 0, 0 };

        // Place the pointer at the beginning of array
        // Move the pointer while subtracting each elements from the target number.
        // [2, 7, 11, 15] [9]
        // P
        // 9 - 2 = 7
        // P
        int diff = 0;
        loop: for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (diff == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    break loop;
                }
            }
        }

        // Time complexity is O(N^2), where N is the length of array nums.
        // Space complexity is O(1)

        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (numsMap.containsKey(diff)) {
                return new int[] {numsMap.get(diff), i};
            }
            numsMap.put(num, i);
        }
        // [2, 5, 5, 1] [10]
        //  P
        //  10 - 2 = 8
        //  P

        // {2:0, 7:1, 11:2, 15:3}
        return new int[] {};

    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 5, 11 };
        int target = 10;
        int[] result = { 0, 0 };
        result = twoSum1(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
