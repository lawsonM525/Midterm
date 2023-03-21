public class CapitalizeTesters {
    
    public static void testCapitalize() {
        CharLinkedList test = new CharLinkedList();
        test.prepend('a');
        test.prepend('b');
        test.prepend('!');
        test.prepend('2');
        test.prepend('E');
        test.prepend('f');
        test.prepend('G');
        test.prepend('-');
        test.prepend('i');
        test.prepend('j');
        System.out.println("Test array: " + test.toString());
        Capitalize.capitalize(test);
        System.out.println("Capitalized array: " + test.toString());

        CharLinkedList test2 = new CharLinkedList();
        test2.prepend('a');
        test2.prepend('b');
        test2.prepend('c');
        test2.prepend('d');
        test2.prepend('e');
        test2.prepend('f');
        test2.prepend('g');
        System.out.println("Test array: " + test2.toString());
        Capitalize.capitalize(test2);
        System.out.println("Capitalized array: " + test2.toString());
    }

    public static void main(String[] args) {
        System.out.println("PROGRAM START");
        System.out.println("============= Testing capitalize =============");
        testCapitalize();
        System.out.println("PROGRAM COMPLETE");
    }

}
