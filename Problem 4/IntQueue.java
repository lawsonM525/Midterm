public class IntQueue {
    IntDoubleLinkedList queue;

    // Constructor
    public IntQueue() {
        queue = new IntDoubleLinkedList();
    }

    /**
     * Adds a value to the end of the queue
     * @param value value to be added
     */
    public void enqueue(int value) {
        queue.append(value);
    }

    /**
     * Removes and returns the value at the front of the queue
     * @return the value at the front of the queue
     */
    public int dequeue() {
        int value = queue.getFirst();
        queue.deleteFirst();
        return value;
    }

    /**
     * Returns the value at the front of the queue without removing it
     * @return the value at the front of the queue
     */
    public int peek() {
        return queue.getFirst();
    }

    /**
     * Returns true if the queue is empty, false otherwise
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Returns a string representation of the queue
     * @return a string representation of the queue
     */
    public String toString() {
        return queue.toString();
    }
}
