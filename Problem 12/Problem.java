public class Problem {

    /**
     * Returns array with only the positive integers in array 
     * @param a array with mixed integers
     * @return array with only positive integers
     */
    public static int[] positiveInt(int[] a) {
        // Step 1
        int x = Helpers.findMax(a);
        
        // Step 2
        int[] c = new int[x];
        
        // Step 3 -5
        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
        }
        
        // Step 6
        int[] b = new int[a.length];

        //Step 7
        int j = 0;
        
        // Step 8 - 13
        for (int i = 0; i < c.length; i++) {
            if (c[i] > 0) {
                b[j] = i;
                j++;
            }
        }
        
        // Step 14
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = b[i];
        }
        
        return result;
    }
    
}
