class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] finalres = new int[nums.length];
        Arrays.fill(finalres, 1);

        int i = 0;
        while (i < nums.length) {
            int preres = 1, sufres = 1;
            for (int j = 0; j < i; j++) {
                preres *= nums[j];
            }
            for (int k = i + 1; k < nums.length; k++) {
                sufres *= nums[k];
            }
            finalres[i] = preres * sufres;
            i++;
        }
        return finalres;
    }
}  
