class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int ref = 0; ref < nums.length; ref++) {
            int target = nums[ref] * -1;
            int p1 = ref + 1, p2 = nums.length - 1;
            while (p1 < p2) {
                if (nums[p1] + nums[p2] == target) {
                    result.add(new ArrayList<>(Arrays.asList(nums[ref], nums[p1], nums[p2])));
                    break;
                }
                if (nums[p1] + nums[p2] > target) {
                    p2--;
                } else {
                    p1++;
                }
            }
        }
        return result;
    }
}
