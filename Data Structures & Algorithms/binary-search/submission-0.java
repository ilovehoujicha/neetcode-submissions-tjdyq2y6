class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid_idx = (left + right) / 2;
            if (nums[mid_idx] == target) return mid_idx;
            else if (nums[mid_idx] >= target) right = mid_idx - 1;
            else left = mid_idx + 1;
        }
        return -1;
    }
}
