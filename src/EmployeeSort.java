// Sort employee according to age and salary using Java 8 Streams

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    int age;
    int salary;
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("A", 25, 50000),
            new Employee("B", 25, 60000),
            new Employee("C", 30, 40000)
        );

        employees.sort(Comparator.comparingInt((Employee e) -> e.age).thenComparingInt(e -> e.salary));

        for(Employee e: employees)
            System.out.print(e.name + " ");
    }
}