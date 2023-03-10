public class IntStackTesters {
    
    /**
     * tests isEmpty method
     */
    public static void testIsEmpty() {
        IntStack stack = new IntStack();
        System.out.println(" ==== Test isEmpty() ====");
        System.out.println("This is our stack: " + stack.toString());
        System.out.println("Stack is empty: " + stack.isEmpty());
    }

    /**
     * tests push method
     */
    public static void testPush() {
        IntStack stack = new IntStack();
        System.out.println(" ==== Test push() ====");
        System.out.println("This is our stack: " + stack.toString());
        System.out.println("Pushing 2 onto the stack");
        stack.push(2);
        System.out.println("This is our stack: " + stack.toString());
        System.out.println("Pushing 4 onto the stack");
        stack.push(4);
        System.out.println("This is our stack: " + stack.toString());
        System.out.println("Pushing 3 onto the stack");
        stack.push(3);
        System.out.println("This is our stack: " + stack.toString());
    }

    /**
     * tests pop method
     */
    public static void testPop(){
        IntStack stack = new IntStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(" ==== Test pop() ====");
        System.out.println("This is our stack: " + stack.toString());
        System.out.println("Popping off the stack");
        stack.pop();
        System.out.println("This is our stack: " + stack.toString());
        System.out.println("Popping off the stack");
        stack.pop();
        System.out.println("This is our stack: " + stack.toString());
        System.out.println("Popping off the stack");
        stack.pop();
        System.out.println("This is our stack: " + stack.toString());
        System.out.println("Popping off the stack");
        stack.pop();
        System.out.println("This is our stack: " + stack.toString());
    }

    /**
     * tests peek method
     */
    public static void testPeek(){
        IntStack stack = new IntStack();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(" ==== Test peek() ====");
        System.out.println("This is our stack: " + stack.toString());
        System.out.println("Peeking at the top of the stack:");
        System.out.println(stack.peek());
    }


    // Main method
    public static void main(String[] args) {
        System.out.println(" ==== Starting Tests ====");
        System.out.println();
        testIsEmpty();
        System.out.println();
        testPush();
        System.out.println();
        testPop();
        System.out.println();
        testPeek();
        System.out.println();
        System.out.println(" ==== Ending Tests ====");
    }
}
