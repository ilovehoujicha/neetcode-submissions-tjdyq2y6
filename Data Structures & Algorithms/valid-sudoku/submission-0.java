class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> uniqueRow = new HashSet<>();
        Set<Character> uniqueSquare = new HashSet<>();
        Map<Character, Boolean> uniqueCol = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            uniqueCol.put(Character.forDigit(i, 10), false);
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (uniqueRow.contains(board[row][col]) || uniqueSquare.contains(board[row][col]) || uniqueCol.get(board[row][col])) return false;
                uniqueRow.add(board[row][col]);
                uniqueSquare.add(board[row][col]);
                uniqueCol.put(board[row][col], true);
                if ((row + 1) % 3 == 0 && (col + 1) % 3 == 0) uniqueSquare.clear();
            }
            uniqueRow.clear();
        }
        return true;
    }
}
