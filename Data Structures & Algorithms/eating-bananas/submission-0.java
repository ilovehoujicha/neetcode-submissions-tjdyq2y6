class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low_speed = 1, high_speed = piles[piles.length - 1];
        int min_speed = high_speed;

        while (low_speed <= high_speed) {
            int mid_speed = (low_speed + high_speed) / 2;
            int time = 0;
            for (int bananas : piles) {
                time += bananas / mid_speed;
                time += (bananas % mid_speed > 0) ? 1 : 0;
            }
            if (time > h) low_speed = mid_speed + 1;
            else if (time <= h) {
                min_speed = Math.min(min_speed, mid_speed);
                high_speed = mid_speed - 1;
            }
        }
        return min_speed;
    }
}
