package Practice;

import java.util.Arrays;


public class ArrayAnalyzer {



    public static boolean isSorted(int[] array) {
        for (int i=0; i<array.length-1; i++) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] copyArray(int array[]) {
        int[] arrayCopy=new int[array.length];

        for (int i=0; i<array.length; i++) {
            arrayCopy[i]=array[i];
        }
        return arrayCopy;
    }

    public static int[] insertionSortCopy(int[] array) {
    int[] arrayCopy = copyArray(array);

    for (int i = 1; i < arrayCopy.length; i++) {
        int key = arrayCopy[i];
        int j = i - 1;

        while (j >= 0 && arrayCopy[j] > key) {
            arrayCopy[j + 1] = arrayCopy[j];
            j--;
        }
        arrayCopy[j + 1] = key;
    }

    return arrayCopy;
}


    public static int countGreaterThan(int[] array, int threshold) {
        int count=0;

        for (int i=0; i<array.length; i++) {
            if (array[i]> threshold)
            {count++;}
        }
        return count;
    }

    public static void printReport(int[] arr) {
        System.out.println("Array Length: " + arr.length);
        System.out.println("Already sorted: " + isSorted(arr));
        System.out.println("Elements greater than 100: " + countGreaterThan(arr, 100));
        if (isSorted(arr)) {
            System.out.println("Already sorted, no further sort needed!");}
        else {
            System.out.println("Array now being sorted");
            int[] sortedArray=insertionSortCopy(arr);

            if (isSorted(sortedArray)) {
                System.out.println("Array now sorted!");


                System.out.println(Arrays.toString(sortedArray));
            }
            else {System.out.println("You suck at programming!");
            System.out.println(Arrays.toString(sortedArray));}


        }
        }

    public static void main(String[] args) {
        int[] data = {120, 85, 200, 90, 150, 90,100,1000,240,869,123};
        printReport(data);

        
    }


    }


    

