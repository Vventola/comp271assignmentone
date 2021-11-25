package comp271.assignment.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTests {
    @Test
    public void runMergeSort(){
        MergeSort mergeSort = new MergeSort(1,4,6,7);
        Integer min = mergeSort.removeMin();
        assertEquals(1,min);

    }
    @Test
    public void runQuickSort(){

    }

    @Test
    public void runSelectionSort(){

    }

}
