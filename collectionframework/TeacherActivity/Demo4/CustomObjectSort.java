import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class CustomObjectSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30));
        employees.add(new Employee("Bob", 25));
        employees.add(new Employee("Charlie", 30));
        employees.add(new Employee("David", 22));

        System.out.println("Original list: " + employees);

        // Sort using a custom Comparator
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                // First, compare by age
                int ageComparison = Integer.compare(e1.age, e2.age);
                if (ageComparison != 0) {
                    return ageComparison;
                }
                // If ages are the same, compare by name
                return e1.name.compareTo(e2.name);
            }
        });

        System.out.println("Sorted list: " + employees);
    }
}
