import java.util.*;

public class SortedEmployeeDemo {
    public static void main(String[] args) {
        Set<String> employees = new TreeSet<>();
        employees.add("Rahul");
        employees.add("Neha");
        employees.add("Amit");

        System.out.println("Sorted Employees: " + employees);
    }
}
