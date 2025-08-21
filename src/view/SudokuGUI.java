package view;

import model.SudokuBoard;
import controller.SudokuSolver;

import javax.swing.*;
import java.awt.*;

public class SudokuGUI extends JFrame {
    private final JTextField[][] cells = new JTextField[9][9];
    private final SudokuBoard board = new SudokuBoard();

    public SudokuGUI() {
        setTitle("Sudoku");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());

        // Painel para o tabuleiro 9x9
        JPanel gridPanel = new JPanel(new GridLayout(9, 9));
        for (int row = 0; row < 9; row++) {
            {
                JTextField cell = new JTextField();
                cell.setHorizontalAlignment(JTextField.CENTER);
                cell.setFont(new Font("Arial", Font.BOLD, 20));
                cells[row][0] = cell;

                // Limita entrada para números de 1 a 9
                cell.setDocument(new JTextFieldLimit(1));
                gridPanel.add(cell);
            }
            {
                JTextField cell = new JTextField();
                cell.setHorizontalAlignment(JTextField.CENTER);
                cell.setFont(new Font("Arial", Font.BOLD, 20));
                cells[row][1] = cell;

                // Limita entrada para números de 1 a 9
                cell.setDocument(new JTextFieldLimit(1));
                gridPanel.add(cell);
            }
            {
                JTextField cell = new JTextField();
                cell.setHorizontalAlignment(JTextField.CENTER);
                cell.setFont(new Font("Arial", Font.BOLD, 20));
                cells[row][2] = cell;

                // Limita entrada para números de 1 a 9
                cell.setDocument(new JTextFieldLimit(1));
                gridPanel.add(cell);
            }
            {
                JTextField cell = new JTextField();
                cell.setHorizontalAlignment(JTextField.CENTER);
                cell.setFont(new Font("Arial", Font.BOLD, 20));
                cells[row][3] = cell;

                // Limita entrada para números de 1 a 9
                cell.setDocument(new JTextFieldLimit(1));
                gridPanel.add(cell);
            }
            {
                JTextField cell = new JTextField();
                cell.setHorizontalAlignment(JTextField.CENTER);
                cell.setFont(new Font("Arial", Font.BOLD, 20));
                cells[row][4] = cell;

                // Limita entrada para números de 1 a 9
                cell.setDocument(new JTextFieldLimit(1));
                gridPanel.add(cell);
            }
            {
                JTextField cell = new JTextField();
                cell.setHorizontalAlignment(JTextField.CENTER);
                cell.setFont(new Font("Arial", Font.BOLD, 20));
                cells[row][5] = cell;

                // Limita entrada para números de 1 a 9
                cell.setDocument(new JTextFieldLimit(1));
                gridPanel.add(cell);
            }
            {
                JTextField cell = new JTextField();
                cell.setHorizontalAlignment(JTextField.CENTER);
                cell.setFont(new Font("Arial", Font.BOLD, 20));
                cells[row][6] = cell;

                // Limita entrada para números de 1 a 9
                cell.setDocument(new JTextFieldLimit(1));
                gridPanel.add(cell);
            }
            {
                JTextField cell = new JTextField();
                cell.setHorizontalAlignment(JTextField.CENTER);
                cell.setFont(new Font("Arial", Font.BOLD, 20));
                cells[row][7] = cell;

                // Limita entrada para números de 1 a 9
                cell.setDocument(new JTextFieldLimit(1));
                gridPanel.add(cell);
            }
            {
                JTextField cell = new JTextField();
                cell.setHorizontalAlignment(JTextField.CENTER);
                cell.setFont(new Font("Arial", Font.BOLD, 20));
                cells[row][8] = cell;

                // Limita entrada para números de 1 a 9
                cell.setDocument(new JTextFieldLimit(1));
                gridPanel.add(cell);
            }
        }
        add(gridPanel, BorderLayout.CENTER);

        // Painel para botões
        JPanel buttonPanel = new JPanel();

        JButton btnValidate = new JButton("Validar");
        btnValidate.addActionListener(e -> validateBoard());
        buttonPanel.add(btnValidate);

        JButton btnReset = new JButton("Resetar");
        btnReset.addActionListener(e -> resetBoard());
        buttonPanel.add(btnReset);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void validateBoard() {
        // Atualiza o SudokuBoard com valores da interface
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                String text = cells[row][col].getText();
                if (text.isEmpty()) {
                    board.setCell(row, col, 0, false);
                } else {
                    try {
                        int val = Integer.parseInt(text);
                        if (val < 1 || val > 9) {
                            throw new NumberFormatException();
                        }
                        board.setCell(row, col, val, false);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(this, "Valores devem ser números de 1 a 9!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
        }

        // Valida o tabuleiro
        if (SudokuSolver.isValidBoard(board)) {
            JOptionPane.showMessageDialog(this, "Tabuleiro válido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Tabuleiro inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void resetBoard() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                cells[row][col].setText("");
            }
        }
        // Limpar o modelo também
        for (int row = 0; row < 9; row++)
            for (int col = 0; col < 9; col++)
                board.setCell(row, col, 0, false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SudokuGUI gui = new SudokuGUI();
            gui.setVisible(true);
        });
    }
}
