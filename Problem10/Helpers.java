public class Helpers {
    
/**
 * Concatenates two char arrays into a new char array.
 * @param arr1 the first char array to concatenate
 * @param arr2 the second char array to concatenate
 * @return a new char array containing the concatenated contents of arr1 and arr2
 */
    public static char[] addArrays(char[] arr1, char[] arr2){
        char[] arr = new char[arr1.length + arr2.length];
        int i = -1;
        
        for(char c : arr1) {
            arr[i++] = c;
        }
        
        for(char c : arr2) {
            arr[i++] = c;
        }
        
        return arr;
    }
    
}
