import java.util.*;

public class TaskDemo {
    public static void main(String[] args) {
        List<String> tasks = Arrays.asList("Homework", "Project", "Groceries");

        System.out.println("Tasks:");
        for(String task : tasks) {
            System.out.println(task);
        }
    }
}
