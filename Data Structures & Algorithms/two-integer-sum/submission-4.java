class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Brute Force Approach - O(n²)
        /*
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
        */

        // Optimal Approach - O(n)
        HashMap<Integer, Integer> numberToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numberToIndex.containsKey(complement)) {
                return new int[] { numberToIndex.get(complement), i };
            }

            numberToIndex.put(nums[i], i);
        }

        return new int[] {};
    }
}