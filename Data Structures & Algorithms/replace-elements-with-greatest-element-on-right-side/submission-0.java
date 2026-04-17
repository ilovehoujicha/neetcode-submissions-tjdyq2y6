class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        int rightmax = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[i] = rightmax;
            rightmax = Math.max(rightmax, arr[i]);
        }
        return ans;
    }
}