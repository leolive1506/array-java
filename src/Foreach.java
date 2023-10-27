public class Foreach {
  public static void main() {
    String[] vect = new String[] {"Maria", "Bob", "Alex"};

    // sem for each
    for (int i = 0; i < vect.length; i++) {
      System.out.println(vect[i]);
    }

    // com foreach
    for (String text : vect) {
      System.out.println(text);
    }
  }
}