class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;

        int total_trapped = 0, max_left = 0, max_right = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= max_left) {
                    max_left = height[left];
                } else {
                    total_trapped += max_left - height[left];
                }
                left++;
            } else {
                if (height[right] >= max_right) {
                    max_right = height[right];
                } else {
                    total_trapped += max_right - height[right];
                }
                right--;
            }
        }
        return total_trapped;
    }
}
