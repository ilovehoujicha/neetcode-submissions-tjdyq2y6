class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int start = 0, end = 0; end < s.length(); end++) {
            char val = s.charAt(end);
            if (!map.containsKey(val) && map.size() == 2) {
                int lower = map.get(s.charAt(end - 1));
                if (lower > (end - start) / 2) lower = end - lower;
                if (lower <= k) {
                    max = Math.max(end - start, max);
                    if (end == s.length() - 1) max = Math.max(end - start + 1, max);
                }
                start = end;
            } 

            if (map.containsKey(val)) map.merge(val, 1, Integer::sum);
            else map.put(val, 1);

            max = (map.size() <= 2) ? end - start : max; 
        }
        return max;
    }
}
