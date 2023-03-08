public class Partition{

    /**
     * Partitions a list into three parts greater than, equal to, and less than x
     * @param seq list to be partitioned
     * @param x value being compared
     * @param whichOutput which part to be outputted
     * @return list selected by user to be outputted
     */
    public static int[] partition(int[] seq, int x, int whichOutput){
        int[] left = new int[seq.length];
        int[] middle = new int[seq.length];
        int[] right = new int[seq.length]; //not very memory efficient

        int leftCount = 0;
        int middleCount = 0;
        int rightCount = 0;
        
        //ADDING VALUES TO  DIFFERENT LISTS
        for(int i=0; i<seq.length; i++){
            if (seq[i] > x){ //append value to right list if value greater than x
                right[rightCount] = seq[i];
                rightCount++;
            } 
            else if (seq[i] < x){//append value to left list if value smaller than x
                left[leftCount] = seq[i];
                leftCount++;
            } 
            else{//append value to middle list if value equal to x
                middle[middleCount] = seq[i];
                middleCount++; 
            }
        }

        //OUTPUTTING CHOSEN LIST
        if (whichOutput == 1){
            return left;
        }
        if (whichOutput == 2){
            return middle;
        }
        if (whichOutput == 3){
            return right;
        }
        System.out.println("Invalid output choice");
        int[] empty = {};
        return empty;
    }
}