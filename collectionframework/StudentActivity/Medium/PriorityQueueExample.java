import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(8);
        pq.add(22);
        pq.add(1);
        pq.add(5);

        System.out.println("Initial PriorityQueue: " + pq);

        System.out.println("Polling elements in order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
