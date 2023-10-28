package exercicies;

import java.util.Scanner;

public class Matriz {
  public static void main() {
    Scanner sc = new Scanner(System.in);

    // dimensão da matriz (linha, coluna)
    int n = sc.nextInt();

    // criando matriz
    /**
     * n = 3
     * mat = 
     * 0 1 2
     * 1
     * 2
     */
    int[][] mat = new int[n][n];

    // cada linha
    for (int linha = 0; linha < mat.length; linha++) {
      // cada coluna
      for (int col = 0; col < mat[linha].length; col++) {
        mat[linha][col] = sc.nextInt();
      }
    }

    // diagonal principal: numeros em que x =  y
    System.out.println("Main diagonal");
    for (int i = 0; i < mat.length; i++) {
      System.out.print(mat[i][i] + " ");
    }
    System.out.println();
    int count = 0;
    for (int linha = 0; linha < mat.length; linha++) {
      for (int col = 0; col < mat[linha].length; col++) {
        if (mat[linha][col] < 0) {
          count++;
        }
      }
    }

    System.out.println("Negative numbers: " + count);

    sc.close();
  }
}
