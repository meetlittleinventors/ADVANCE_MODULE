import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Integer> cacheMap;
    private final Queue<Integer> accessQueue;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new HashMap<>();
        this.accessQueue = new LinkedList<>();
    }

    public int get(int key) {
        if (cacheMap.containsKey(key)) {
            // Move the accessed key to the end of the queue
            accessQueue.remove(key);
            accessQueue.add(key);
            return cacheMap.get(key);
        }
        return -1; // Indicate key not found
    }

    public void put(int key, int value) {
        if (cacheMap.containsKey(key)) {
            // Update value and move to end
            cacheMap.put(key, value);
            accessQueue.remove(key);
            accessQueue.add(key);
        } else {
            if (cacheMap.size() >= capacity) {
                // Remove the least recently used element (from the front)
                int lruKey = accessQueue.remove();
                cacheMap.remove(lruKey);
            }
            cacheMap.put(key, value);
            accessQueue.add(key);
        }
    }

    @Override
    public String toString() {
        return "Cache (LRU): " + cacheMap + " | Access Order: " + accessQueue;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);

        System.out.println("Adding elements to cache...");
        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(3, 30);
        System.out.println("After initial puts: " + cache);

        System.out.println("\nAccessing key 2...");
        cache.get(2);
        System.out.println("After get(2): " + cache); // 2 should now be most recent

        System.out.println("\nPutting new key 4...");
        // This will cause key 1 to be removed as it's the LRU
        cache.put(4, 40);
        System.out.println("After put(4): " + cache);
    }
}
