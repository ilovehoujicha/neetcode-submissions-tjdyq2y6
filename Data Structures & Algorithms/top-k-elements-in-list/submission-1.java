class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < k; j++) {
            int max_freq = -1;
            int highest_key = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max_freq) {
                    max_freq = entry.getValue();
                    highest_key = entry.getKey();
                }
            }
            res.add(highest_key);
            map.remove(highest_key);
        }
        int[] res_arr = res.stream().mapToInt(i -> i).toArray();
        return res_arr;
    }
}
