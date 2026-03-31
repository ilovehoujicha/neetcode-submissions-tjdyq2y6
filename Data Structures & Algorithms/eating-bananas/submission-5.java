class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low_speed = 1, high_speed = 0;
        int lowest_speed = high_speed;

        for (int num : piles) high_speed = Math.max(high_speed, num);

        while (low_speed <= high_speed) {
            int mid_speed = (low_speed + high_speed) / 2;
            int time = 0;
            for (int bananas : piles) {
                time += bananas / mid_speed;
                time += (bananas % mid_speed > 0) ? 1 : 0;
            }
            if (time > h) low_speed = mid_speed + 1;
            else if (time <= h) {
                lowest_speed = Math.min(lowest_speed, mid_speed);
                high_speed = mid_speed - 1;
            }
        }
        return lowest_speed;
    }
}
