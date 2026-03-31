class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int p1 = 0, p2 = numbers.length - 1; p1 < numbers.length; ) {
            if (numbers[p1] + numbers[p2] == target) {
                res[0] = p1 + 1;
                res[1] = p2 + 1;
                break;
            } 
            if (numbers[p1] + numbers[p2] > target) {
                p2--;
            } else {
                p1++;
            }
        }
        return res;
    }
}
