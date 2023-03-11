public class Node {
    
    Node next; //pointer to next node
    Node previous; //pointer to previous node in DLL
    int data;

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