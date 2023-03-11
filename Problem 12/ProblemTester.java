
public class ProblemTester {
    
    /**
     * Tests positiveInt method
     */
    public static void testPositiveInt() {
        System.out.println(" ===== TESTING POSITIVEINT =====");
        int[] arr = {2,5,3,4,8,1,7,6,9};
        System.out.println("Array: ");
        Helpers.printArray(arr);
        System.out.println("PositiveInt output: ");
        Helpers.printArray(Problem.positiveInt(arr));
    }

    public static void main(String[] args){
        System.out.println("===== PROGRAM STARTING =====");
        testPositiveInt();
        System.out.println("");
        System.out.println("===== PROGRAM ENDED =====");
    }
}
