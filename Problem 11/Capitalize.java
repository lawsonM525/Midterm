public class Capitalize {
    
    /**
     * Capitalizes all characters in an array of characters in place.
     * @param string array of characters to be capitalized
     * @param start 
     * @param end 
     */
    public static void capitalize(CharLinkedList string, Node current) {
        if (current == null) {
            return;
        }
        char temp = charCapitalize(current.data);
        current.data = temp;
        capitalize(string, current.next);
        return;
    }
        

    /**
     * Wrapper for above recursive function.
     * @param string array of characters to be capitalized
     */
    public static void capitalize(CharLinkedList string) {
        capitalize(string, string.head);
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
