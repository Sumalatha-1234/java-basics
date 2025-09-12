//The Context-Aware Garbage Collector Simulator
// SimulatedObject.java
public class SimulatedObject {
    private final long id;
    private final String context; // e.g., "low-priority", "high-priority"
    private boolean isReachable;

    // Constructor and getters...
}

// MemorySimulator.java
public class MemorySimulator {
    private List<SimulatedObject> heap;
    private long totalMemoryUsage;
    private final long maxMemory;

    public MemorySimulator(long maxMemory) {
        this.maxMemory = maxMemory;
        this.heap = new ArrayList<>();
        this.totalMemoryUsage = 0;
    }

    public void allocate(SimulatedObject obj) {
        heap.add(obj);
        // Update totalMemoryUsage
    }

    public void collectGarbage() {
        if (totalMemoryUsage < maxMemory * 0.8) {
            // No need to collect yet.
            return;
        }

        // Custom Garbage Collection Policy
        // 1. Iterate and mark all "low-priority" objects as unreachable.
        // 2. Iterate and remove all unreachable objects from the heap.
        //    A new list can be created to store reachable objects.
        // 3. Update totalMemoryUsage.
    }
}

// Main.java (Example usage)
public class Main1 {
    public static void main(String[] args) {
        MemorySimulator gcSim = new MemorySimulator(1000); // 1000 units of memory

        gcSim.allocate(new SimulatedObject("low-priority"));
        gcSim.allocate(new SimulatedObject("high-priority"));
        // ...
        gcSim.collectGarbage(); // Will collect the "low-priority" object if memory is high.
    }
}
