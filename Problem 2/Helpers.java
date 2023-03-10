public class Helpers {

    /**
     * Swaps the data of two nodes
     * @param a first node
     * @param b second node
     */
    public static void swap(Node a, Node b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }
}
