class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> uniqueRow = new HashMap<>();
        Map<Integer, Set<Character>> uniqueSquare = new HashMap<>();
        Map<Integer, Set<Character>> uniqueCol = new HashMap<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char value = board[row][col];
                if (value == '.') continue;

                int square = (row / 3) * 3 + (col / 3);

                uniqueRow.putIfAbsent(row, new HashSet<>());
                uniqueCol.putIfAbsent(col, new HashSet<>());
                uniqueSquare.putIfAbsent(square, new HashSet<>());

                if (uniqueRow.get(row).contains(value) || uniqueCol.get(col).contains(value) || uniqueSquare.get(square).contains(value)) return false;

                
                uniqueRow.get(row).add(value);
                uniqueCol.get(col).add(value);
                uniqueSquare.get(square).add(value);
            }
        }
        return true;
    }
}
