package algorithm;

public class QuickSort {

    public void sort(RecordInfo[] array, int low, int high){
        if(low < high){
            int pi = partition(array, low, high);
            sort(array, low, pi-1);
            sort(array, pi+1, high);
        }
    }

    /**
     * mark the last element as pivot and compare that with the first elements
     * after full execution less values stays left side of the pivot and
     * greater values stays right side of the pivot.
     *
     * @param array is type RecordInfo that need to be sorted
     * @param low the lower index sent from method sort.can't be less than 0
     * @param high higher index sent from method sort. can't be more that or equal to array size.
     */
    private int partition(RecordInfo[] array, int low, int high) {
        RecordInfo pivot = array[high];

        int i = (low - 1);

        for(int j = low; j < high; j++){
            if(array[j].getName().compareTo(pivot.getName()) <=0){
                i++;

                RecordInfo temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        RecordInfo temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return (i+1);
    }
}
