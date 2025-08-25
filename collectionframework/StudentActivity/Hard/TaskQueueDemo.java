import java.util.*;

public class TaskQueueDemo {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Email");
        tasks.add("Meeting");
        tasks.add("Coding");

        tasks.add("Review"); // add new task

        System.out.println("Queue before removing: " + tasks);

        tasks.poll(); // remove first task
        System.out.println("Queue after removing: " + tasks);
    }
}
