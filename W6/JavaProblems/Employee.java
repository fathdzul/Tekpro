package JavaProblems;

public class Employee {
    private String name;
    private int salary;

    // Constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // name getter
    public String getName() {
        return name;
    }

    // salary getter
    public int getSalary() {
        return salary;
    }

    // metode menampilkan informasi employee
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}