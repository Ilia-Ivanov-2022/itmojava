package lesson4;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Lab4Part2 {
    public static void main(String[] args) {

        // Exercise 1. Check if an array is sorted.
        int[] arrayUnsorted = new int[]{2, 1, 4, 3, 7, 87, 5};
        int[] arraySorted = new int[]{1, 2, 3, 4, 5};
        System.out.println(isArraySorted(arrayUnsorted));
        System.out.println(isArraySorted(arraySorted));

        // Exercise 2. Fill an array.
        int arrNew[] = new int[arrayLength()];
        fillArray(arrNew);
        System.out.println("Result: " + Arrays.toString(arrNew));

        // Exercise 3. Swap first and last array elements.
        String[] arrString = new String[]{"The", "quick", "brown", "fox"};
        System.out.println("Before swap: " + Arrays.toString(arrString));
        System.out.println("After swap: " + Arrays.toString(swapFirstAndLast(arrString)));
        System.out.println("Before swap: " + Arrays.toString(arraySorted));
        System.out.println("After swap: " + Arrays.toString(swapFirstAndLast(arraySorted)));

        // Exercise 4. Find first unique value in an array.
        int[] arrUFV = new int[]{1, 2, 5, 2, 4, 1, 3, 4};
        int[] arrUFV2 = new int[]{4,6,2,7,4,9,5,3,2,0,7,8,7,8,1,6,43,45,};

        findFirstUniqueValue(arrUFV);
        findFirstUniqueValue(arrUFV2);

        // Exercise 5.
        // Creating an array of random length.
        int[] randomArray = new int[ThreadLocalRandom.current().nextInt(1,20)];
        // Fill the above array with random integers.
        for(int r = 0; r < randomArray.length; r++){
            randomArray[r] = ThreadLocalRandom.current().nextInt(0, 100);
        }
        System.out.println("Random Array: " + Arrays.toString(randomArray));
        // Sorting method.
        System.out.println("Sorted Array: " + Arrays.toString(sortArray(randomArray)));
    }

    // METHODS FOR EXERCISES IN MAIN
    // Exercise 1.
    private static String isArraySorted(int[] arr) {
        String result = null;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                result = "OK";
            } else {
                result = "Please, try again.";
            }
        }
        return result;
    }

    // Exercise 2.
    private static int arrayLength() {
        System.out.print("Please enter desired length of the array: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] fillArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length: " + arr.length);
        System.out.println("Enter " + arr.length + " integer values of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Exercise 3.
    private static int[] swapFirstAndLast(int[] args) {
        int temp = args[0];
        args[0] = args[args.length - 1];
        args[args.length - 1] = temp;
        return args;
    }

    private static String[] swapFirstAndLast(String[] args) {
        String temp = args[0];
        args[0] = args[args.length - 1];
        args[args.length - 1] = temp;
        return args;
    }

    // Exercise 4.
    private static void findFirstUniqueValue(int[] args) {
        ArrayList<Integer> dump = new ArrayList<>(); // list of inner loop checked values.
        for (int i = 0; i < args.length; i++) { // loop to go through all the elements one-by-one.
            int counter = 0; // Iteration counter. If iteration number == ((array.length - 1) - i)
                                                    // -> first unique number; break;
            for (int j = i + 1; j < args.length; j++) { // inner loop
                if (args[i] != args[j]) {
                    counter++;
                } else if (args[i] == args[j]) {
                    dump.add(args[i]);
                }
            }
            if (counter == ((args.length - 1) - i)) { // check if a duplicate has been found.
                    Integer flag = 0;
                    for(int d : dump){ // check if the duplicate preceded in initial array.
                        if(args[i] == d){
                            flag = 1;
                            break;
                        }
                    }
                if(flag == 0){
                    System.out.println("Для массива " + Arrays.toString(args) +
                            " первое уникальное число: " + args[i]);
                    break;
                }
            }
        }
    }


    // Exercise 5. Sorting.
    private static int[] sortArray(int[] arr){
        // Check if not null
        if(arr == null){
            return arr;
        }
        // Check id arr.length > 1.
        if(arr.length < 2){
            return arr;
        }
        // Split array into two parts: left and right.
        int[] leftArr = new int[arr.length / 2];
        int[] rightArr = new int[arr.length - leftArr.length];
        // Fill up left part from arr.
        for(int i = 0; i < leftArr.length; i++){
            leftArr[i] = arr[i];
        }
        // The same with right part.
        for(int j = 0; j < rightArr.length; j++){
            rightArr[j] = arr[(arr.length / 2) + j];
        }
        // Recursively invoke sortArray down to a single element.
        leftArr = sortArray(leftArr);
        rightArr = sortArray(rightArr);
        // Recursively invoke mergeArray.
        return mergeArray(leftArr, rightArr);
    }
    private static int[] mergeArray(int[] leftArr, int[] rightArr){
        int[] mergedArray = new int[leftArr.length + rightArr.length];
        // Index increments.
        int leftPointer = 0;
        int rightPointer = 0;
        int mergedPointer = 0;

        while(leftPointer < leftArr.length || rightPointer < rightArr.length){
            if(leftPointer < leftArr.length && rightPointer < rightArr.length){
                if(leftArr[leftPointer] < rightArr[rightPointer]){
                    mergedArray[mergedPointer++] = leftArr[leftPointer++];
                }else{
                    mergedArray[mergedPointer++] = rightArr[rightPointer++];
                }
            } else if (leftPointer < leftArr.length) {
                mergedArray[mergedPointer++] = leftArr[leftPointer++];
            } else if (rightPointer < rightArr.length) {
                mergedArray[mergedPointer++] = rightArr[rightPointer++];
            }
        }
        return mergedArray;
    }
}
