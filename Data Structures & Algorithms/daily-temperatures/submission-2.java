class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int val = temperatures[i];
            while (!stack.isEmpty() && val > temperatures[stack.peek()]) {
                int last_index = stack.pop();
                result[last_index] = i - last_index;
            }
            stack.push(i);
        }
        return result;
    }
}
