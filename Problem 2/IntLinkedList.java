public class IntLinkedList{

    Node head;

    // Constructor
    public IntLinkedList(){
        head = null;
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
     * Adds node to beginning of list
     * @param node node to be prepended
     */
    public void prepend(Node node){//overloaded method to allow prepending to stack
        node.next = head;
        head = node;
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
            listString += " -> " + current.next.toString();
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
    public IntLinkedList deleteFirst(){
        if (this.isEmpty()){
            System.out.println("List is empty");
            return this;
        }
        head = head.next;
        return this;
    }

    /**
     * Returns data of first node in list
     * @return data of first node
     */    
    public int getFirst(){
        if (this.isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        return head.data;
    }


}