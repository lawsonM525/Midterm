public class Helpers {
    
    /**
     * Concatenates two char arrays into a new char array.
     * @param arr1 the first char array to concatenate
     * @param arr2 the second char array to concatenate
     * @return a new char array containing the concatenated contents of arr1 and arr2
     */
    public static char[] addArrays(char[] arr1, char[] arr2){
        char[] arr = new char[arr1.length + arr2.length];
        int i = 0;
        
        for(char c : arr1) {
            arr[i] = c;
            i++;
        }
        
        for(char c : arr2) {
            arr[i] = c;
            i++;
        }
        
        return arr;
    }

    /**
     * Converts a char array to a String
     * @param arr the char array to convert
     * @return a String containing the contents of arr
     */
    public static String toString(char[] arr) {
        String str = "";
        for (char c : arr) {
            str += c;
        }
        return str;
    }
    
}
