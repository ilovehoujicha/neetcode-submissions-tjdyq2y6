class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> uniqueRow = new HashSet<>();
        Set<Character> uniqueSquare = new HashSet<>();
        Map<Integer, Set<Character>> uniqueCol = new HashMap<>();

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == '.') continue;
                if (uniqueRow.contains(board[row][col]) || uniqueSquare.contains(board[row][col])) return false;
                if (uniqueCol.getOrDefault(col, Collections.emptySet()).contains(board[row][col])) return false;
                uniqueRow.add(board[row][col]);
                uniqueSquare.add(board[row][col]);
                uniqueCol.computeIfAbsent(col, k -> new HashSet<>()).add(board[row][col]);
                if ((row + 1) % 3 == 0 && (col + 1) % 3 == 0) uniqueSquare.clear();
            }
            uniqueRow.clear();
        }
        return true;
    }
}
