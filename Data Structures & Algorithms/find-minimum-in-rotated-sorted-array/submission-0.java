class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while (left <= right) {
            int mid_idx = (left + right) / 2;
            min = Math.min(min, nums[mid_idx]);
            if (nums[left] < nums[mid_idx]) left = mid_idx + 1;
            else right = mid_idx - 1;
        }
        return min;
    }
}
