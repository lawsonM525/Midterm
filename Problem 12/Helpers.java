public class Helpers {
    
    /**
     * Finds the maximum value in an array
     * @param a array to be searched
     * @return maximum value in array
     */
    public static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    /**
     * prints an array
     * @param array array to be printed
     */
    public static void printArray(int[] array){
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i != array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
