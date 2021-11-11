package comp271.assignment.one;

import static java.util.Arrays.sort;

public class AssignmentOne {
    public void main(String[] args) {
        private final List<Integer> integers;

    public SelectionSortPriorityQueue(Integer... integers) {
            this.integers = new ArrayList<>();
            for (Integer integer : integers) {
                this.integers.add(integer);
            }
        }

        @Override
        public Integer removeMin() {

            Integer[] numbers = this.integers.toArray(new Integer[this.integers.size()]);

            selectionSort(numbers);

            Integer minimumValue = numbers[0];
            this.integers.remove(minimumValue);
            return minimumValue;
        }

        private void selectionSort(Integer[] numbers) {
    }

        int temp = 0;
        int indexOfSmallest = 0;
        int[] numbers;
        for (int i = 0; i < numbers.length - 1; i++) {
        }
        indexOfSmallest = i;
        for (int j = i + 1; j < numbers.length; j++) {
            if (numbers[j] < numbers[indexOfSmallest]) {
                indexOfSmallest = j;
            }
        }
        temp = numbers[i];
        numbers[i] = numbers[indexOfSmallest];
        numbers[indexOfSmallest] = temp;

        public class QuickSortPriorityQueue implements PriorityQueue {
            private final List<Integer> integers;

            public QuickSortPriorityQueue(Integer... integers) {
                this.integers = new ArrayList<>();
                for (Integer integer : integers) {
                    this.integers.add(integer);
                }
            }
            @Override
            public Integer removeMin() {

                Integer[] numbers = this.integers.toArray(new Integer[this.integers.size()]);

                sort(numbers);

                Integer minimumValue = numbers[0];
                this.integers.remove(minimumValue);
                return minimumValue;
            }
            private int partition(Integer[] numbers, int lowIndex, int highIndex) {
                int indexOfPivot = lowIndex + (highIndex - lowIndex) / 2;
                int pivotValue = numbers[indexOfPivot];
                int temp = 0;

                boolean done = false;
                while (!done) {

                    while (numbers[lowIndex] < pivotValue) {
                        lowIndex++;
                    }

                    while (pivotValue < numbers[highIndex]) {
                        highIndex--;
                    }

                    if (lowIndex >= highIndex) {
                        done = true;
                    } else {
                        temp = numbers[lowIndex];
                        numbers[lowIndex] = numbers[highIndex];
                        numbers[highIndex] = temp;
                        lowIndex++;
                        highIndex--;
                    }
                    return =highIndex

                }
                private void sort(Integer[] numbers) {
                    quickSort(numbers, 0, numbers.length - 1);
                }
                private void quickSort(Integer[] numbers, int lowIndex, int highIndex) {

                    if (lowIndex >= highIndex) {
                        return;
                    }

                    int rightMostIndexOfLowEnd = partition(numbers, lowIndex, highIndex);

                    quickSort(numbers, lowIndex, rightMostIndexOfLowEnd);
                    quickSort(numbers, rightMostIndexOfLowEnd+1, highIndex);
                }
                public class MergeSortPriorityQueue implements PriorityQueue {

                    private final List<Integer> integers;

                    public MergeSortPriorityQueue(Integer... integers) {
                        this.integers = new ArrayList<>();
                        for (Integer integer : integers) {
                            this.integers.add(integer);
                        }
                    }

                    @Override
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


