public class IntDoubleLinkedList{

    Node head;

    // Constructor
    public IntDoubleLinkedList(){
        head = null;
    }

    /**
     * Appends value to the list
     * @param data value to be appended
     */
    public void append(int data){
        if (head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    /**
     * Adds value to beginning of list
     * @param data value to be prepended
     */
    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    /**
     * Converts list to visual string representation
     */
    public String toString(){
        String listString = "";
        if (head==null) return "Empty list";

        listString += head.toString();
        Node current = head;
        while(current.next != null){
            listString += " <-> " + current.next.toString();
            current = current.next;
        }

        return listString;
    }

    /**
     * Checks if list is empty
     * @return T/F 
     */
    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }

    /**
     * Deletes first node in list
     * @return list after node has been deleted
     */
    public IntDoubleLinkedList deleteFirst(){
        if (this.isEmpty()){
            System.out.println("List is empty");
            return this;
        }
        head = head.next;
        return this;
    }

    /**
     * Deletes last node in list
     * @return list after node has been deleted
     */
    public IntDoubleLinkedList deleteLast(){
        if (this.isEmpty()){
            System.out.println("List is empty");
            return this;
        }
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        return this;
    }

    /**
     * Deletes last node in list
     * @return list after node has been deleted
     */
    public int getFirst(){
        if (this.isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        return head.data;
    }

    /**
     * Returns data of last node in list
     * @return data of last node
     */
    public int getLast(){
        if (this.isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        return current.data;
    }


}