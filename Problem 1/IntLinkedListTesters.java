public class IntLinkedListTesters { //break up testers into tests into individual functions

    /**
     * Tests toString() method
     */
    public static void testToString() {
        System.out.println(" ===== TESTING TOSTRING =====");
        IntLinkedList list = new IntLinkedList();
        System.out.println("Testing toString() method for empty list:");
        System.out.println("String Result \"" + list.toString() + "\"");
        System.out.println("Prepending 66");
        list.prepend(66);
        System.out.println("String Result \"" + list.toString() + "\"");
        System.out.println("Prepending 34");
        list.prepend(34);     
        System.out.println("String Result \"" + list.toString() + "\"");   
    }
    
    /**
     * Tests prepend() method
     */
    public static void testPrepend() {
        System.out.println(" ===== TESTING PREPEND =====");
        IntLinkedList list = new IntLinkedList();
        System.out.println("Testing prepend() method with one element:");
        System.out.println("Prepending 3 to list");
        list.prepend(3);
        System.out.println("String Result: \"" + list.toString() + "\"");
        System.out.println("Prepending 4 to list");
        list.prepend(4);
        System.out.println("String Result: \"" + list.toString() + "\"");
    }

    /**
     * Tests deleteFirst() method
     */
    public static void testDeleteFirst() {
        System.out.println(" ===== TESTING DELETEFIRST =====");
        IntLinkedList list = new IntLinkedList();
        list.prepend(6);
        list.prepend(5);
        list.prepend(3);
        System.out.println("List: \"" + list.toString() + "\"");
        System.out.println("Deleting first from list");
        list.deleteFirst();
        System.out.println("String Result: \"" + list.toString() + "\"");
    }

    /**
     * Tests getFirst() method
     */
    public static void testGetFirst() {
        System.out.println(" ===== TESTING GETFIRST =====");
        IntLinkedList list = new IntLinkedList();
        list.prepend(6);
        list.prepend(5);
        list.prepend(3);
        System.out.println("List: \"" + list.toString() + "\"");
        System.out.println("Getting first from list");
        System.out.println(list.getFirst());
    }


    public static void main(String[] args){
        System.out.println("===== PROGRAM STARTING =====");
        testToString();
        System.out.println("");
        testPrepend();
        System.out.println("");
        testDeleteFirst();
        System.out.println("");
        testGetFirst();
        System.out.println("");
        System.out.println("===== PROGRAM ENDED =====");
    }

    /*
     * Problem 1 Reflection:
     *  I was initially thinking the best way to add nodes to the list for testing would be the append method.
     * However, since the only methods to be implemented are prepend, deleteFirst, and getFirst, I shifted my thought 
     * process to use prepend to create all test lists.
     * 
     */
    
}
