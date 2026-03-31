class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            Stack<Integer> stack = new Stack<>();
            int val = heights[i];
            int j = i - 1;
            int k = i + 1;
            while (j >= 0 && heights[j] >= val) {
                stack.push(j);
                j--;
            }
            while (k < heights.length && heights[k] >= val) {
                stack.push(k);
                k++;
            }
            int calc = val * (stack.size() + 1);
            if (calc > max) max = calc;
        }
        return max;
    }
}
