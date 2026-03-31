class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int counter = 1;
        int comparison_val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if ((comparison_val + 1) == nums[i]) {
                comparison_val = nums[i];
                counter++;
            }
        }
        return counter;
    }
}
