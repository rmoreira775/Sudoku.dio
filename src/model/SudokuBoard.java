package model;

public class SudokuBoard {
    private final int[][] board = new int[9][9];
    private final boolean[][] fixed = new boolean[9][9];

    public void setCell(int row, int col, int value, boolean isFixed) {
        board[row][col] = value;
        fixed[row][col] = isFixed;
    }

    public int getValue(int row, int col) {
        return board[row][col];
    }

    public boolean isFixed(int row, int col) {
        return fixed[row][col];
    }

    public void loadFromArgument(String data) {
        String[] cells = data.split(" ");
        for (String cell : cells) {
            String[] parts = cell.split(";");
            if (parts.length < 2) continue;  // ignorar dados inválidos

            String[] pos = parts[0].split(",");
            int row = Integer.parseInt(pos[0]);
            int col = Integer.parseInt(pos[1]);

            String[] valFlag = parts[1].split(",");
            int value = Integer.parseInt(valFlag[0]);
            boolean isFixed = Boolean.parseBoolean(valFlag[1]);

            setCell(row, col, value, isFixed);
        }
    }

    public void printBoard() {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}
