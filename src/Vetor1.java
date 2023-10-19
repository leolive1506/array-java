import java.util.Scanner;

public class Vetor1 {
  public static void main() {
    Scanner sc = new Scanner(System.in);
  
    int n = sc.nextInt();
    double[] vect = new double[n];
  
    for (int i = 0; i < vect.length; i++) {
        vect[i] = sc.nextDouble();
    }
  
    double sum = 0.0;
    for (int i = 0; i < vect.length; i++) {
        sum += vect[i];
    }
  
    double avg = sum / vect.length;
    System.out.println("AVG HEIGHT: " + avg);
    sc.close();
  }
}
