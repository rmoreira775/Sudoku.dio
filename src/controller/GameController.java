package controller;

import model.SudokuBoard;

public class GameController {
    private SudokuBoard board;

    public void newGameFromArg(String arg) {
        board = new SudokuBoard();
        board.loadFromArgument(arg);
        System.out.println("Jogo carregado a partir do argumento:");
        board.printBoard();
    }

    // outros métodos...
}
