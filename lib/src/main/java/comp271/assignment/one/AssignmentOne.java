package comp271.assignment.one;

import static java.util.Arrays.sort;

public class AssignmentOne {
    public static void main(String[] args) {
        int []numbers= {0,1,2,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};

        sort(numbers);
        printArray(numbers);
    }
    public static void sort(int[] A){
    for (int i =0; i < A.length-1; i++){
        int minIndex = i;
        for(int j = i + 1;j < A.length;j++){
            if(A[j] < A[minIndex]){
                minIndex = j;

            }
        }
        int temp = A[minIndex];
        A[minIndex] = A[i];
        A[i] =  temp;
    }
    public static void QuickSort(int[] arr,int low,int high) {
        if (low>high) return;
        int mid= low+(high=low)/2;
        int pivot= arr[mid];
        int i=low;
        int j= high;
        while(i<=j){
            while(arr[i]<pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if (i <= j) {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
           if(low<j)
               QuickSort(arr, low, j);
           if(high >i)
               QuickSort(arr, i, high);


            }

        }

//    public class MergeSort {
//
//        private final List<Integer> integers;
//
//        public MergeSortPriority(Integer... integers) {
//            this.integers = new ArrayList<>();
//            for (Integer integer : integers) {
//                this.integers.add(integer);
//            }
//        }
//        public Integer removeMin() {
//
//            Integer[] numbers = this.integers.toArray(new Integer[this.integers.size()]);
//
//            sort(numbers);
//
//            Integer minimumValue = numbers[0];
//            this.integers.remove(minimumValue);
//            return minimumValue;
//        }
//
//        private void sort(Integer[] numbers) {
//
//            mergeSort(numbers, 0, numbers.length-1);
//        }
//
//        private void mergeSort(Integer[] numbers, int startIndex, int endIndex) {
//            int midPoint = 0;
//
//            if (startIndex < endIndex) {
//                midPoint = (startIndex + endIndex)/2;
//
//                mergeSort(numbers, startIndex, midPoint);
//                mergeSort(numbers, midPoint+1, endIndex);
//
//                merge(numbers, startIndex, midPoint, endIndex);
//            }
//        }
//
//        private void merge(Integer[] numbers, int startIndex, int midPoint, int endIndex) {
//
//            int sizeOfMergedNumbers = endIndex - startIndex + 1;
//            int leftPosition = startIndex;
//            int rightPosition = midPoint + 1;
//            int mergePosition = 0;
//            Integer[] mergedNumbers = new Integer[sizeOfMergedNumbers];
//
//            while (leftPosition <= midPoint && rightPosition <= endIndex) {
//                if (numbers[leftPosition] < numbers[rightPosition]) {
//                    mergedNumbers[mergePosition] = numbers[leftPosition];
//                    leftPosition++;
//                } else {
//                    mergedNumbers[mergePosition] = numbers[rightPosition];
//                    rightPosition++;
//                }
//                mergePosition++;
//            }
//
//            while (leftPosition <= midPoint) {
//                mergedNumbers[mergePosition] = numbers[leftPosition];
//                leftPosition++;
//                mergePosition++;
//            }
//
//            while (rightPosition <= endIndex) {
//                mergedNumbers[mergePosition] = numbers[rightPosition];
//                rightPosition++;
//                mergePosition++;
//            }
//
//            for (mergePosition = 0; mergePosition < sizeOfMergedNumbers; mergePosition++) {
//                numbers[startIndex + mergePosition] = mergedNumbers[mergePosition];
//            }
//        }
//    }





}

