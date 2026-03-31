class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int volume = 0;
        while (left < right) {
            int temp = (right - left) * Math.min(heights[left], heights[right]);
            
            if (temp > volume) {
                volume = temp;
            } 
            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }
        return volume;
    }
}
