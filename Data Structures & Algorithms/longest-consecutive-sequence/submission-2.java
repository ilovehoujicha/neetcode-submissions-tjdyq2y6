class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);

        int final_counter = 1, counter = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] == nums[i - 1] + 1) {
                counter++;
                continue;
            }
            if (counter > final_counter) {
                final_counter = counter;
                counter = 1;
            }
        }
        return Math.max(final_counter, counter);
    }
}
