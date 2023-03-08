public class Capitalize {
    
    public static String capitalize(char[] string, start, end) {
        if (string.isEmpty()) {
            return string;
        } else {
            char firstChar = string[0];
            String restOfString = string[1:n];
            char capitalizedChar = charCapitalize(firstChar);
            return addArrays(capitalizedChar,capitalize(string, start+1, end));
        }
    }

    public static char charCapitalize(char character) {
        if (character.isLowerCase) {
            return character.toUpperCase;
        } else {
            return character;
        }
    }
    
}
