import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ListA {
  public static void main() {
    List<String> list = new ArrayList<String>();

    list.add("Maria");
    list.add("Alex");
    list.add("Daniel");
    list.add("Ana");
    list.add("Leonardo");
    list.add(1, "Marco");

    for (String x : list) {
      System.out.println(x);
    }

    System.out.println("-------------");
    list.remove("Daniel");
    list.remove(0);
    // usando predicado para remover todo que comecem com "M"
    list.removeIf(x -> x.charAt(0) == 'M');

    for (String x : list) {
      System.out.println(x);
    }

    // procurar posição
    System.out.println("Index of alex: " + list.indexOf("Alex"));
    List<String> result = list.stream().filter(
      x -> x.charAt(0) == 'A'
    ).collect(Collectors.toList());

    System.out.println("-------------");
    for (String x : result) {
      System.out.println(x);
    }

    // procurar el que atenda um certo predicado
    String name = list.stream()
      .filter(x -> x.charAt(0) == 'A')
      .findFirst()
      .orElse(null);
    System.out.println("Nome procurado: " + name);
  }
}
