public class CapitalizeTesters {
    
    public static void testCapitalize() {
        char[] test = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        System.out.println("Test array: " + Helpers.toString(test));
        Capitalize.capitalize(test);
        System.out.println("Capitalized array: " + Helpers.toString(test));

        char[] test2 = {'a', 'b', '!', '2', 'E', 'f', 'G', '-', 'i', 'j'};
        System.out.println("Test array: " + Helpers.toString(test2));
        Capitalize.capitalize(test2);
        System.out.println("Capitalized array: " + Helpers.toString(test2));
    }

    public static void main(String[] args) {
        System.out.println("PROGRAM START");
        System.out.println("============= Testing capitalize =============");
        testCapitalize();
        System.out.println("PROGRAM COMPLETE");
    }

}
