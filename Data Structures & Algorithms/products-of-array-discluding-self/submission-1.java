class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);

        int preres = 1, sufres = 1;
        for (int j = 1; j < nums.length; j++) {
            res[j] = res[j - 1] * nums[j - 1];
        }

        int suf = 1;
        for (int k = nums.length - 1; k >= 0; k--) {
            res[k] *= suf;
            suf *= nums[k];
        }
        return res;
    }
}  
