# 🧩 Projeto Sudoku em Java

Este projeto é um jogo Sudoku implementado em Java, que combina lógica de resolução, interface gráfica e manipulação de dados do tabuleiro.

## 📦 Componentes Principais

- **SudokuBoard (Modelo):**  
  Representa o tabuleiro de 9x9 células, armazenando os valores de cada célula e indicando quais são fixas (não editáveis) e quais podem ser preenchidas pelo jogador.

- **SudokuSolver (Lógica):**  
  Implementa a lógica para validar o estado atual do tabuleiro e para resolver o Sudoku automaticamente usando um algoritmo de backtracking, garantindo que as regras do jogo sejam respeitadas.

- **SudokuGUI (Interface):**  
  Fornece uma interface gráfica interativa para o jogador inserir números, visualizar o tabuleiro e interagir com o jogo. Inclui funcionalidades como limitar a entrada dos campos, destacar células fixas e botões para ações como “resolver” e “reiniciar”.

## 🎯 Objetivos do Projeto

- Proporcionar uma experiência interativa de jogo Sudoku.
- Aplicar conceitos de Programação Orientada a Objetos:
  - Encapsulamento (modelo do tabuleiro)
  - Abstração (lógica do solver)
  - Separação de responsabilidades
- Utilizar **Swing** para criação da interface gráfica.
- Oferecer possibilidade de extensão futura:
  - Salvar/recuperar jogos
  - Diferentes níveis de dificuldade
  - Melhorias na interface

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/rmoreira775/Sudoku.dio.git
