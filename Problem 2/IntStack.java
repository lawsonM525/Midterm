public class IntStack {
    // Class member variables
    public IntLinkedList stack;
    // top variable unnecessary since we have a head variable in the linkedlist
    //private int size;
    //Stack has no size since it is a linkedlist

    // Constructor
    public IntStack() {
        stack = new IntLinkedList();
    }

    // Methods
    /**
     * Checks if the stack is empty
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return (stack.isEmpty());
    }

    /**
     * Peeks at the top of the stack
     * @return integer value at the top of the stack
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack.getFirst();
        }
    }

    /**
     * Pushes an integer onto the stack
     * @param c integer to be pushed onto the stack
     */
    public void push(int i) {
        Node newNode = new Node(i);
        stack.prepend(newNode.data);
    }

    /**
     * Pops an integer off the stack
     * @return integer popped off the stack
     */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int popped = stack.getFirst();
            stack.deleteFirst();
            return popped;
        }
    }

    /**
     * Returns stack as a string from the bottom to the top of the stack
     * @return string representation of stack
     */
    public String toString() {
        String stackString = "";
        if (stack.isEmpty()) return "Empty stack";

        stackString = " " + stack.getFirst();
        Node current = stack.head;
        while(current.next != null){
            stackString = current.next.toString()+ " -> " + stackString;//bottom to top
            current = current.next;
        }


        stackString = "Bottom -> " + stackString + " -> Top";

        return stackString;
    }
    
}