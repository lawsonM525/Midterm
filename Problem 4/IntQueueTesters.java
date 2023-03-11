public class IntQueueTesters {
    
    /**
     * Tests the enqueue method
     */
    public static void testEnqueue() {
        System.out.println(" ===== TESTING ENQUEUE =====");
        IntQueue queue = new IntQueue();
        System.out.println("Testing enqueue() method with one element:");
        System.out.println("Enqueueing 3 to queue");
        queue.enqueue(3);
        System.out.println("String Result: \"" + queue.toString() + "\"");
        System.out.println("Enqueueing 4 to queue");
        queue.enqueue(4);
        System.out.println("String Result: \"" + queue.toString() + "\"");
    }

    /**
     * Tests the dequeue method
     */
    public static void testDequeue() {
        System.out.println(" ===== TESTING DEQUEUE =====");
        IntQueue queue = new IntQueue();
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(3);
        System.out.println("Queue: \"" + queue.toString() + "\"");
        System.out.println("Dequeueing from queue");
        queue.dequeue();
        System.out.println("String Result: \"" + queue.toString() + "\"");
    }

    /**
     * Tests the peek method
     */
    public static void testPeek() {
        System.out.println(" ===== TESTING PEEK =====");
        IntQueue queue = new IntQueue();
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(3);
        System.out.println("Queue: \"" + queue.toString() + "\"");
        System.out.println("Peeking at queue");
        System.out.println("String Result: \"" + queue.peek() + "\"");
    }

    /**
     * Tests the isEmpty method
     */
    public static void testIsEmpty() {
        System.out.println(" ===== TESTING ISEMPTY =====");
        IntQueue queue = new IntQueue();
        System.out.println("Queue: \"" + queue.toString() + "\"");
        System.out.println("Testing isEmpty() method for empty queue:");
        System.out.println("String Result \"" + queue.isEmpty() + "\"");
        System.out.println("Enqueueing 6");
        queue.enqueue(6);
        System.out.println("String Result \"" + queue.isEmpty() + "\"");
    }

    /**
     * Tests the toString method
     */
    public static void testToString() {
        System.out.println(" ===== TESTING TOSTRING =====");
        IntQueue queue = new IntQueue();
        System.out.println("Testing toString() method for empty queue:");
        System.out.println("String Result \"" + queue.toString() + "\"");
        System.out.println("Enqueueing 6");
        queue.enqueue(6);
        System.out.println("String Result \"" + queue.toString() + "\"");
        System.out.println("Enqueueing 5");
        queue.enqueue(5);
        System.out.println("String Result \"" + queue.toString() + "\"");
    }

    // Main method
    public static void main(String[] args) {
        System.out.println(" ======= PROGRAM STARTING =======");
        System.out.println("");
        testEnqueue();
        System.out.println("");
        testDequeue();
        System.out.println("");
        testPeek();
        System.out.println("");
        testIsEmpty();
        System.out.println("");
        testToString();
        System.out.println("");
        System.out.println(" ======= PROGRAM FINISHED =======");
    }

}
