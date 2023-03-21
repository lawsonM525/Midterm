public class Partition{

    /**
     * Partitions a list into three parts greater than, equal to, and less than x
     * @param seq list to be partitioned
     * @param x value being compared
     * @param whichOutput which part to be outputted
     * @return linked list selected by user to be outputted
     */
    public static IntLinkedList partition(int[] seq, int x, int whichOutput){
        IntLinkedList left = new IntLinkedList();
        IntLinkedList middle = new IntLinkedList();
        IntLinkedList right = new IntLinkedList();
        
        //ADDING VALUES TO  DIFFERENT LISTS
        for(int i=0; i<seq.length; i++){
            if (seq[i] > x){ //append value to right list if value greater than x
                right.prepend(seq[i]);
            } 
            else if (seq[i] < x){//append value to left list if value smaller than x
                left.prepend(seq[i]);
            } 
            else{//append value to middle list if value equal to x
                middle.prepend(seq[i]);
            }
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