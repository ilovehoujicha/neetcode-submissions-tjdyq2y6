class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        int stored_index;
        for (int i = 0; i < temperatures.length; i++) {
            int val = temperatures[i];
            int j = i;
            int counter = 0;
            boolean found = false;
            while (j < temperatures.length) {
                if (temperatures[j] > val) {
                    found = true;
                    break;
                }
                counter++;
                j++;
            }
            if (found) result[i] = counter;
        }
        return result;
    }
}
