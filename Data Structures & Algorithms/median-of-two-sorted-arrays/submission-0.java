class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1;
        int[] B = nums2;

        if (A.length > B.length) {
            A = nums2;
            B = nums1;
        }

        int left = 0, right = A.length;

        int required_half = (A.length + B.length + 1) / 2;

        while (left <= right) {
            int i = (left + right) / 2;
            int j = required_half - i;

            // MIN & MAX to neglect values since none selected
            int a_left = (i == 0) ? Integer.MIN_VALUE : A[i - 1];
            int a_right = (i == A.length) ? Integer.MAX_VALUE : A[i];

            int b_left = (j == 0) ? Integer.MIN_VALUE : B[j - 1];
            int b_right = (j == B.length) ? Integer.MAX_VALUE : B[j];

            // If splits are valid and form a proper singular sorted array
            if (a_left <= b_right && b_left <= a_right) {
                // If array is odd, return the bigger right-edged element on the entire left side
                if ((A.length + B.length) % 2 == 1) return Math.max(a_left, b_left);
                // If array is even, return average of the two middle elements
                else return (Math.max(a_left, b_left) + Math.min(a_right, b_right)) / 2.0;
            } 
            else if (a_left > b_right) {
                right = i - 1; 
                // a_left too big = too many elements in A
                // Shift left to give less elements to A = lower value in A
            } else { // (b_left > a_right)
                left = i + 1; 
                // b_left too big = too many elements in B = too little elements in A
                // Shift right to give more elements to A = less elements in B = lower value in B 
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}
