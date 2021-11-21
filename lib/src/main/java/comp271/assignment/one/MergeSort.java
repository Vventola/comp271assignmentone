package comp271.assignment.one;

import java.util.ArrayList;
import java.util.List;

/**
 * This class was added by Kieran, to help you sort out your code if you decide
 * to resubmit for additional credit.
 *
 * I created this class by copying lines 53 through 127 of your AssignmentOne class,
 * and pasting them into this file.  IntelliJ added the correct import statements.
 *
 * This class compiles because it obeys two fundamental rules of Java, rules which
 * your version does _not_ obey:
 *
 *  1. There is one class per .java file
 *  2. The filename matches the class name
 *  3. The package name on line 1 matches the directory in which the file is stored
 *
 *  In other words: the class named MergeSort, which is declared to be in the package
 *  named comp271.assignment.one, is stored in a file named MergeSort.java,
 *  which is stored in a directory found at src/comp271/assignment/one.
 *
 *  If you want to follow this example and make your code compile and your test run,
 *  please do, and let me know when you want me to reevaluate your work.
 */
public class MergeSort {

    private final List<Integer> integers;

    public MergeSort(Integer... integers) {
        this.integers = new ArrayList<>();
        for (Integer integer : integers) {
            this.integers.add(integer);
        }
    }
    public Integer removeMin() {

        Integer[] numbers = this.integers.toArray(new Integer[this.integers.size()]);

        sort(numbers);

        Integer minimumValue = numbers[0];
        this.integers.remove(minimumValue);
        return minimumValue;
    }

    private void sort(Integer[] numbers) {

        mergeSort(numbers, 0, numbers.length-1);
    }

    private void mergeSort(Integer[] numbers, int startIndex, int endIndex) {
        int midPoint = 0;

        if (startIndex < endIndex) {
            midPoint = (startIndex + endIndex)/2;

            mergeSort(numbers, startIndex, midPoint);
            mergeSort(numbers, midPoint+1, endIndex);

            merge(numbers, startIndex, midPoint, endIndex);
        }
    }

    private void merge(Integer[] numbers, int startIndex, int midPoint, int endIndex) {

        int sizeOfMergedNumbers = endIndex - startIndex + 1;
        int leftPosition = startIndex;
        int rightPosition = midPoint + 1;
        int mergePosition = 0;
        Integer[] mergedNumbers = new Integer[sizeOfMergedNumbers];

        while (leftPosition <= midPoint && rightPosition <= endIndex) {
            if (numbers[leftPosition] < numbers[rightPosition]) {
                mergedNumbers[mergePosition] = numbers[leftPosition];
                leftPosition++;
            } else {
                mergedNumbers[mergePosition] = numbers[rightPosition];
                rightPosition++;
            }
            mergePosition++;
        }

        while (leftPosition <= midPoint) {
            mergedNumbers[mergePosition] = numbers[leftPosition];
            leftPosition++;
            mergePosition++;
        }

        while (rightPosition <= endIndex) {
            mergedNumbers[mergePosition] = numbers[rightPosition];
            rightPosition++;
            mergePosition++;
        }

        for (mergePosition = 0; mergePosition < sizeOfMergedNumbers; mergePosition++) {
            numbers[startIndex + mergePosition] = mergedNumbers[mergePosition];
        }
    }
}