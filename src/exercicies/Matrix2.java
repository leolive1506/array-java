package exercicies;

import java.util.Scanner;

public class Matrix2 {
  public static void main() {
    Scanner sc = new Scanner(System.in);
    int linhas = sc.nextInt();
    int colunas = sc.nextInt();

    int matrix[][] = new int[linhas][colunas];
    for (int linha = 0; linha < matrix.length; linha++) {
      for (int col = 0; col < matrix[linha].length; col++) {
        matrix[linha][col] = sc.nextInt();
      }
    }

    int numProcurado = sc.nextInt();
    for (int linha = 0; linha < matrix.length; linha++) {
      for (int col = 0; col < matrix[linha].length; col++) {
        if (matrix[linha][col] == numProcurado) {
          System.out.printf("Position: %d,%d%n", linha, col);
          int colunaAnterior = col - 1;
          if (colunaAnterior >= 0) {
            System.out.println("Left: " + matrix[linha][colunaAnterior]);
          }

          int proximaColuna = col + 1;
          if (proximaColuna < matrix[linha].length) {
            System.out.println("Right: " + matrix[linha][proximaColuna]);
          }

          int linhaAnterior = linha - 1;
          if (linhaAnterior >= 0) {
            System.out.println("Up: " + matrix[linhaAnterior][col]);
          }

          int proximaLinha = linha + 1;
          if (proximaColuna < matrix.length) {
            System.out.println("Down: " + matrix[proximaLinha][col]);
          }
          System.out.println();
        }
      }
    }
  }


}
