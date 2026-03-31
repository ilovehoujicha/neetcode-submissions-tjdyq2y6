class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int min_idx;
        while (left < right) {
            int mid_idx = (left + right) / 2;
            if (nums[right] < nums[mid_idx]) left = mid_idx + 1;
            else right = mid_idx;
        }
        min_idx = left;

        if (nums[min_idx] <= target && nums[nums.length - 1] >= target) {
            left = min_idx;
            right = nums.length - 1;
        }
        else {
            left = 0;
            right = min_idx - 1;
        }

        while (left <= right) {
            int mid_idx = (left + right) / 2;
            if (nums[mid_idx] == target) return mid_idx;
            else if (nums[mid_idx] < target) left = mid_idx + 1;
            else right = mid_idx - 1;
        }
        return -1;
    }
}
