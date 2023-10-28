package exercicies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.exercicies.Employee;

public class ExercicioLista {
  public static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many emplyees will be register? ");
    int qtdFuncionario = sc.nextInt();
    Integer id;
    String name;
    Double salary;

    int idChangeSalary;
    Double percentageChangeSalary;

    List<Employee> employees = new ArrayList<Employee>();

    for (int i = 1; i <= qtdFuncionario; i++) {
      System.out.println("Employee #" + 1);
      System.out.print("Id: ");
      id = sc.nextInt();

      System.out.print("Name: ");
      sc.nextLine();
      name = sc.nextLine();

      System.out.print("Salary: ");
      salary = sc.nextDouble();

      employees.add(new Employee(id, name, salary));
    }

    System.out.print("Enter the employee id that will hava salary increase: ");
    idChangeSalary = sc.nextInt();

    Employee employeeSearch = employees.stream()
      .filter(x -> x.getId() == idChangeSalary)
      .findFirst()
      .orElse(null);

    if (employeeSearch == null) {
      System.out.println("Thid id not exist!");
    } else {
      System.out.print("Enter the percentage: ");
      percentageChangeSalary = sc.nextDouble();
      employeeSearch.increaseSalary(percentageChangeSalary);
    }

    for (Employee employee: employees) {
      System.out.println(employee);
    }
  }
}
