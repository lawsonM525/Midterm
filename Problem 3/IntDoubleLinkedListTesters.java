public class IntDoubleLinkedListTesters { 

    /**
     * Tests toString() method
     */
    public static void testToString() {
        System.out.println(" ===== TESTING TOSTRING =====");
        IntDoubleLinkedList list = new IntDoubleLinkedList();
        System.out.println("Testing toString() method for empty list:");
        System.out.println("String Result \"" + list.toString() + "\"");
        System.out.println("Appending a");
        list.append('a');
        System.out.println("String Result \"" + list.toString() + "\"");
        System.out.println("Appending b");
        list.append('b');     
        System.out.println("String Result \"" + list.toString() + "\"");   
    }

    /**
     * Tests append() method
     */
    public static void testAppend() {
        System.out.println(" ===== TESTING APPEND =====");
        IntDoubleLinkedList list = new IntDoubleLinkedList();
        System.out.println("Testing append() method with one element:");
        System.out.println("Appending 6 to list");
        list.append(6);
        System.out.println("String Result: \"" + list.toString() + "\"");
        System.out.println("Appending 5 to list");
        list.append(5);
        System.out.println("String Result: \"" + list.toString() + "\"");
    }
    
    /**
     * Tests prepend() method
     */
    public static void testPrepend() {
        System.out.println(" ===== TESTING PREPEND =====");
        IntDoubleLinkedList list = new IntDoubleLinkedList();
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
        IntDoubleLinkedList list = new IntDoubleLinkedList();
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
        IntDoubleLinkedList list = new IntDoubleLinkedList();
        list.prepend(6);
        list.prepend(5);
        list.prepend(3);
        System.out.println("List: \"" + list.toString() + "\"");
        System.out.println("Getting first from list");
        System.out.println(list.getFirst());
    }

    /**
     * Tests deleteLast() method
     */
    public static void testDeleteLast() {
        System.out.println(" ===== TESTING DELETELAST =====");
        IntDoubleLinkedList list = new IntDoubleLinkedList();
        list.prepend(6);
        list.prepend(5);
        list.prepend(3);
        System.out.println("List: \"" + list.toString() + "\"");
        System.out.println("Deleting last from list");
        list.deleteLast();
        System.out.println("String Result: \"" + list.toString() + "\"");
    }

    /**
     * Tests getLast() method
     */
    public static void testGetLast() {
        System.out.println(" ===== TESTING GETLAST =====");
        IntDoubleLinkedList list = new IntDoubleLinkedList();
        list.prepend(6);
        list.prepend(5);
        list.prepend(3);
        System.out.println("List: \"" + list.toString() + "\"");
        System.out.println("Getting last from list");
        System.out.println(list.getLast());
    }
  

    public static void main(String[] args){
        System.out.println("===== PROGRAM STARTING =====");
        testToString();
        System.out.println("");
        testAppend();
        System.out.println("");
        testPrepend();
        System.out.println("");
        testDeleteFirst();
        System.out.println("");
        testGetFirst();
        System.out.println("");
        testDeleteLast();
        System.out.println("");
        testGetLast();
        System.out.println("");
        System.out.println("===== PROGRAM ENDED =====");
    }

    /**
     * Problem 3 Reflection:
     * I updated the toString method for this class to have two pointers representing
     * the way the nodes in a doubly linked list have pointers both to the next and
     * previous nodes. 
     */
    
}
