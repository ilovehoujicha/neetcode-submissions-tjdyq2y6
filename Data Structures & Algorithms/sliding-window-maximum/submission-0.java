class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int[] res = new int[nums.length - k + 1];
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < k; i++) maxheap.offer(new int[]{nums[i], i});

        res[0] = maxheap.peek()[0];

        for (int i = k; i < nums.length; i++) {
            maxheap.offer(new int[]{nums[i], i});
            if (i <= k - 1) {
                while (maxheap.peek()[1] <= i - k) {
                    maxheap.poll();
                }
            }
            res[i - k + 1] = maxheap.peek()[0];
        }
        return res;
    }
}
