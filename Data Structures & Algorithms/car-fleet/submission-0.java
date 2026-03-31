class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        
        Integer[] indices = new Integer[position.length];
        for (int i = 0; i < position.length; i++) indices[i] = i;
        Arrays.sort(indices, (i, j) -> Integer.compare(position[j], position[i]));
        int[] sortedPos = new int[position.length];
        int[] sortedSpeed = new int[position.length];

        for (int i = 0; i < position.length; i++) {
            sortedPos[i] = position[indices[i]];
            sortedSpeed[i] = speed[indices[i]];
        }

        System.arraycopy(sortedPos, 0, position, 0, position.length);
        System.arraycopy(sortedSpeed, 0, speed, 0, position.length);

        for (int i = 0; i < sortedPos.length; i++) {
            double time = (double) (target - sortedPos[i]) / sortedSpeed[i];
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }
        return stack.size();
    }
}
