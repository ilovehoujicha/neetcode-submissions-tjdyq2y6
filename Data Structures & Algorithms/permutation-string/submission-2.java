class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        int right = s1.length();
        int[] comp_arr = new int[26];
        int[] res_arr = new int[26]; 
        
        if (s1.length() > s2.length()) return false;

        // Prefill first window alongside S1
        for (int i = 0; i < s1.length(); i++) { 
            comp_arr[s1.charAt(i) - 'a']++; 
            res_arr[s2.charAt(i) - 'a']++; 
        }
        if (Arrays.equals(comp_arr, res_arr)) return true;
        
        for (int j = s1.length(); j < s2.length(); j++) {
            res_arr[s2.charAt(j) - 'a']++; // Add current char
            res_arr[s2.charAt(j - s1.length()) - 'a']--; // Remove char s1.length() positions back
            if (Arrays.equals(comp_arr, res_arr)) return true;
        }
        return false;
    }
}
