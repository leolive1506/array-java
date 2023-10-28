package entities.exercicies;

public class Employee {
  private Integer id;
  private String name;
  private Double salary;

  public Employee(Integer id, String name, Double salary) {
    this.setId(id);
    this.setName(name);
    this.setSalary(salary);
  }

  public int getId() {
    return id;
  }

  private void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public void increaseSalary(double percentage) {
    salary += salary * (percentage / 100);
  }

  @Override
  public String toString() {
    return this.id + "," + this.name + "," + this.salary;
  }
}
