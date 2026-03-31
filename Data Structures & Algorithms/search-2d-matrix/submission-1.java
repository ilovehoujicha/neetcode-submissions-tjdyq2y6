class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = matrix.length - 1;
        int row_length = matrix[0].length;
        int found_idx = -1;
        while (left <= right) {
            int mid_idx = (left + right) / 2;
            if (matrix[mid_idx][0] <= target && matrix[mid_idx][row_length - 1] >= target) {
                found_idx = mid_idx;
                break;
            }
            else if (matrix[mid_idx][0] > target) right = mid_idx - 1;
            else if (matrix[mid_idx][row_length - 1] < target) left = mid_idx + 1;
        }
        
        if (found_idx == -1) return false;

        left = 0;
        right = row_length - 1;
        while (left <= right) {
            int mid_idx = (left + right) / 2;
            if (matrix[found_idx][mid_idx] == target) return true;
            else if (matrix[found_idx][mid_idx] > target) right = mid_idx - 1;
            else if (matrix[found_idx][mid_idx] < target) left = mid_idx + 1;
        }
        return false;
    }
}
