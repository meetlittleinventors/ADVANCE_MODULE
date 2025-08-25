import java.util.*;

public class StudentIDDemo {
    public static void main(String[] args) {
        Set<Integer> studentIDs = new HashSet<>();
        studentIDs.add(101);
        studentIDs.add(102);
        studentIDs.add(103);
        studentIDs.add(101); // duplicate ignored

        System.out.println("Student IDs: " + studentIDs);
    }
}
