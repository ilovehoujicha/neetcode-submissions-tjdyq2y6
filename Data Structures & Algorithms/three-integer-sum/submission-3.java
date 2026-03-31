class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int ref = 0; ref < nums.length; ref++) {
            int target = -nums[ref];

            if (ref > 0 && nums[ref] == nums[ref - 1]) continue;

            int p1 = ref + 1, p2 = nums.length - 1;
            while (p1 < p2) {
                if (nums[p1] + nums[p2] == target) {
                    result.add(new ArrayList<>(Arrays.asList(nums[ref], nums[p1], nums[p2])));
                    while (p1 < p2 && nums[p1] == nums[p1 + 1]) p1++;
                    while (p1 < p2 && nums[p2] == nums[p2 - 1]) p2--;
                    p1++;
                    p2--;
                    continue;
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
