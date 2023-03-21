public class Partition{

    /**
     * Partitions a list into three parts greater than, equal to, and less than x
     * @param seq list to be partitioned
     * @param x value being compared
     * @param whichOutput which part to be outputted
     * @return linked list selected by user to be outputted
     */
    public static IntLinkedList partition(IntLinkedList seq, int x, int whichOutput){
        IntLinkedList left = new IntLinkedList();
        IntLinkedList middle = new IntLinkedList();
        IntLinkedList right = new IntLinkedList();
        
        //ADDING VALUES TO  DIFFERENT LISTS
        Node current = seq.head;
        while(current.next!=null){
            if (current.data > x){ //append value to right list if value greater than x
                right.prepend(current.data);
                current = current.next;
            } 
            else if (current.data < x){//append value to left list if value smaller than x
                left.prepend(current.data);
                current = current.next;
            } 
            else{//append value to middle list if value equal to x
                middle.prepend(current.data);
                current = current.next;
            }
        }
        //One last check for the last node
        if (current.data > x){ //append value to right list if value greater than x
            right.prepend(current.data);
        } 
        else if (current.data < x){//append value to left list if value smaller than x
            left.prepend(current.data);
        } 
        else{//append value to middle list if value equal to x
            middle.prepend(current.data);
        }

        //OUTPUTTING CHOSEN LIST
        if (whichOutput == 1){
            return left;
        }
        if (whichOutput == 2){
            return middle;
        }
        if (whichOutput == 3){
            return right;
        }
        System.out.println("Invalid output choice");
        IntLinkedList empty = new IntLinkedList();
        return empty;
    }
}