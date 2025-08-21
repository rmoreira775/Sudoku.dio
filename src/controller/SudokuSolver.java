package controller;


import model.SudokuBoard;

public class SudokuSolver {

    public static boolean isValidBoard(SudokuBoard board) {
        // valida linhas
        for (int row = 0; row < 9; row++) {
            boolean[] seen = new boolean[10];
            for (int col = 0; col < 9; col++) {
                int val = board.getValue(row, col);
                if (val != 0) {
                    if (seen[val]) return false;
                    seen[val] = true;
                }
            }
        }
        // valida colunas
        for (int col = 0; col < 9; col++) {
            boolean[] seen = new boolean[10];
            for (int row = 0; row < 9; row++) {
                int val = board.getValue(row, col);
                if (val != 0) {
                    if (seen[val]) return false;
                    seen[val] = true;
                }
            }
        }
        // valida blocos 3x3
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                boolean[] seen = new boolean[10];
                for (int row = boxRow * 3; row < boxRow * 3 + 3; row++) {
                    for (int col = boxCol * 3; col < boxCol * 3 + 3; col++) {
                        int val = board.getValue(row, col);
                        if (val != 0) {
                            if (seen[val]) return false;
                            seen[val] = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}
