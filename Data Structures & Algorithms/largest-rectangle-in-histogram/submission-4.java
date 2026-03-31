class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0; 
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= heights.length; i++) {
            int val = (i == heights.length) ? 0 : heights[i];
            
            while (!stack.isEmpty() && val < heights[stack.peek()]) {
                int lowest_height = heights[stack.pop()]; // Lowest height before i = first element in stack

                int width;
                if (stack.isEmpty()) width = i;
                else width = i - stack.peek() - 1;

                int calc = lowest_height * width;
                max = Math.max(calc, max);
            }
            stack.push(i);
        }
        return max;
    }
}
