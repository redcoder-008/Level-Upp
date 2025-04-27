import java.util.Comparator;
import java.util.PriorityQueue;

public class BuildingPriorityQueue {
    public static void main(String[] args) {
        // Example usage of the BuildingPriorityQueue class
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // for the reverse order
        pq.add(3);
        pq.add(5);
        pq.add(1);
        pq.add(9);
        pq.add(6);
        pq.add(7);
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }

    }
}