package exercicies;

import java.util.Scanner;

public class Matriz2 {
  public static void main() {
    Scanner sc = new Scanner(System.in);
    int linhas = sc.nextInt();
    int colunas = sc.nextInt();

    int matriz[][] = new int[linhas][colunas];
    for (int linha = 0; linha < matriz.length; linha++) {
      for (int col = 0; col < matriz[linha].length; col++) {
        matriz[linha][col] = sc.nextInt();
      }
    }

    int numProcurado = sc.nextInt();
    for (int linha = 0; linha < matriz.length; linha++) {
      for (int col = 0; col < matriz[linha].length; col++) {
        if (matriz[linha][col] == numProcurado) {
          System.out.printf("Position: %d,%d%n", linha, col);
          int colunaAnterior = col - 1;
          if (colunaAnterior >= 0) {
            System.out.println("Left: " + matriz[linha][colunaAnterior]);
          }

          int proximaColuna = col + 1;
          if (proximaColuna < matriz[linha].length) {
            System.out.println("Right: " + matriz[linha][proximaColuna]);
          }

          int linhaAnterior = linha - 1;
          if (linhaAnterior >= 0) {
            System.out.println("Up: " + matriz[linhaAnterior][col]);
          }

          int proximaLinha = linha + 1;
          if (proximaColuna < matriz.length) {
            System.out.println("Down: " + matriz[proximaLinha][col]);
          }
          System.out.println();
        }
      }
    }
  }


}
