public class Node {
    
    Node next;
    char data;

    // Constructor
    public Node(char data){
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