class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int end_digit = i;
            while (end_digit < str.length() && Character.isDigit(str.charAt(end_digit))) {
                end_digit++;
            }

            int len = Integer.parseInt(str.substring(i, end_digit));
            int start_index = end_digit + 1;
            String word = str.substring(start_index, start_index + len);
            decoded_list.add(word);
            i = start_index + len;
        }
        return decoded_list;
    }
}
