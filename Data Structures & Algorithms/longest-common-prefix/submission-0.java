class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            int idx = 0;
            while (idx < Math.min(prefix.length(), strs[i].length())) {
                if (prefix.charAt(idx) != strs[i].charAt(idx)) break;
                idx++;
            }
            prefix = prefix.substring(0, idx);
        }
        return prefix;
    }
}