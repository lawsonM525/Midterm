public class PartitionTesters {

    public static void testPartition() {
        System.out.println(" ===== TESTING PARTITION =====");
        IntLinkedList list = new IntLinkedList();
        list.prepend(1);
        list.prepend(9);
        list.prepend(2);
        list.prepend(6);
        list.prepend(4);
        list.prepend(5);
        list.prepend(8);
        list.prepend(3);
        list.prepend(7);
        System.out.println("List: ");
        System.out.println(list.toString());
        System.out.println("Partition output for left of 4: "+ (Partition.partition(list, 4, 1)).toString());
        System.out.println("Partition output for right of 4: " +(Partition.partition(list, 4, 3)).toString());
        System.out.println("Partition output for middle at 4: "+(Partition.partition(list, 4, 2)).toString());
    }

    
    
    

    public static void main(String[] args){
        System.out.println("===== PROGRAM STARTING =====");
        testPartition();
        System.out.println("");
        System.out.println("===== PROGRAM ENDED =====");
    }
    
}
