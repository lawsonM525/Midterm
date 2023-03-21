public class PartitionTesters {

    public static void testPartition() {
        System.out.println(" ===== TESTING GETFIRST =====");
        int[] arr = {2,5,3,4,8,1,7,6,9};
        System.out.println("Array: ");
        Helpers.printArray(arr);
        System.out.println("Partition output for left of 4: "+ (Partition.partition(arr, 4, 1)).toString());
        System.out.println("Partition output for right of 4: " +(Partition.partition(arr, 4, 3)).toString());
        System.out.println("Partition output for middle at 4: "+(Partition.partition(arr, 4, 2)).toString());
    }

    
    
    

    public static void main(String[] args){
        System.out.println("===== PROGRAM STARTING =====");
        testPartition();
        System.out.println("");
        System.out.println("===== PROGRAM ENDED =====");
    }
    
}
