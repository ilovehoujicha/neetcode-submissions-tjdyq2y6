class Solution {
    public boolean isAnagram(String s, String t) {
        char[] scharArray = s.toCharArray();
        char[] tcharArray = t.toCharArray();
        Arrays.sort(scharArray);
        Arrays.sort(tcharArray);
        String sortedS = new String(scharArray);
        String sortedT = new String(tcharArray);

        if (sortedS.equals(sortedT)) {
            return true;
        }
        return false;
    }
}
