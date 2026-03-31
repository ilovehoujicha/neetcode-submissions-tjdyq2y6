class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map  = new HashMap<>();

        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) map.merge(c, 1, Integer::sum);
            else map.put(c, 1);
        }
        
        int left = 0, right = s.length() - 1;
        for (; left + 3 < right; ) {
            if (!map.containsKey(s.charAt(left))) left++;
            if (!map.containsKey(s.charAt(right))) right--;
        }

        if (t.equals(s.substring(left, right + 1))) return s.substring(left, right + 1);
        return "";
    }
}
