public class Capitalize {
    
    /**
     * Capitalizes all characters in an array of characters in place.
     * @param string array of characters to be capitalized
     * @param start 
     * @param end 
     */
    public static void capitalize(CharLinkedList string, int start, int end) {
        if (start==end) {
            return;
        } else {
            char firstChar = string.head.data;
            char capitalizedChar = charCapitalize(firstChar);
            string[start] = capitalizedChar;
            capitalize(string, start+1, end);
            return;
        }
    }

    /**
     * Wrapper for above recursive function.
     * @param string array of characters to be capitalized
     */
    public static void capitalize(CharLinkedList string) {
        capitalize(string, 0, string.length);
        return;
    }

    /**
     * Capitalizes a character if it is a letter.
     * @param character character to be capitalized
     * @return capitalized character if it was loer case, otherwise the same character
     */
    public static char charCapitalize(char character) {
        if (character >= 'a' && character <= 'z') {
            return (char) (character - 32);
        } else {
            return character;
        }
    }
    //Methodology inspired by: http://www.cs.trincoll.edu/~crypto/cryptogrammer/CryptoGram.java
    
}
