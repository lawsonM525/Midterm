public class Node {
    
    Node next;
    int data;

    // Constructor
    public Node(int data){
        this.data = data;
    }

    /**
     * Converts node to string by returning data as a string
     * @return String of data
     */
    public String toString(){ 
        return " "+data ;
    }

}