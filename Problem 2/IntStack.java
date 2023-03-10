public class IntStack {
    // Class member variables
    private IntLinkedList stack;
    private Node top;
    //private int size;
    //Stack has no size since it is a linkedlist

    // Constructor
    public IntStack() {
        Node top = null;// top is the last node in the stack
        IntLinkedList stack = new IntLinkedList();
    }

    // Methods
    /**
     * Checks if the stack is empty
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return (top == null);
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
            return top.data;
        }
    }

    /**
     * Pushes an integer onto the stack
     * @param c integer to be pushed onto the stack
     */
    public void push(int i) {
        Node newNode = new Node(i);
        stack.prepend(newNode);
        top = newNode;
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
            int popped = top.data;
            stack.deleteFirst();
            top = stack.head;
            return popped;
        }
    }

    /**
     * Returns stack as a string from the bottom to the top of the stack
     * @return string representation of stack
     */
    public String toString() {
        String stackString = "";
        if (top==null) return "Empty stack";

        stackString = top.toString();
        Node current = top;
        while(current.next != null){
            stackString = current.next.toString()+ " -> " + stackString;//bottom to top
            current = current.next;
        }

        stackString = "Bottom -> " + stackString + " -> Top";

        return stackString;
    }
    
}