public class SelectionSort {
    private int temp;
    /** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }

    /* A simple SelectionSort algorithm
     * pre-condition:
     * post-condition:
     * inputs:
     * outputs:
     * special conditions:
     */
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length; ++i) {
            int currMin = x[i];
            int replacementIndex = i;
            for (int j= i+1; j < x.length; ++j) {
                if (x[j] < currMin) {
                    currMin = x[j];
                    replacementIndex = j;
                }
            } // end of inner for loop
            int temp = x[i];
            x[i] = x[replacementIndex];
            x[replacementIndex] = temp;

        } // end of outer for loop
        return x;
    } // end of basicSelectionSort method
}