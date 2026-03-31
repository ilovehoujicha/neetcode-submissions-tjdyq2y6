class TimeMap {
    HashMap<String, List<Data>> map;
    public TimeMap() {
        map = new HashMap<>();
    }

    private class Data {
        int timestamp;
        String value;
        Data(int t, String v) { timestamp = t; value = v; }
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new Data(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";

        List<Data> datalist = map.get(key);
        int left = 0, right = datalist.size() - 1;
        String res = "";
        while (left <= right) {
            int mid_idx = (left + right) / 2;
            if (datalist.get(mid_idx).timestamp <= timestamp) {
                res = datalist.get(mid_idx).value;
                left = mid_idx + 1;
            } 
            else {
                right = mid_idx - 1;
            }
        }
        return res;
    }
}
