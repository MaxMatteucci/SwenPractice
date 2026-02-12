package Practice.Exam2.LectureSix;
import java.util.Arrays;




public class CheckSort {


    public static boolean isSorted(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        
            
        }
        return true;
    }

    public static void swapValues(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    public static void insertionSort(int[] array) {
        int swaps=0;
        for (int i=1; i<array.length; i++) {
            int j=i;
            while (j>0 && array[j]<array[j-1]) {
                swapValues(array, j, j-1);
                j--;
                swaps++;
            }
        }
        System.out.println(swaps);
    }


public static void main(String[] args) {
    int[] newArray={1,2,3,4,5,22,86,78, 6,7,8};
    insertionSort(newArray);
    System.out.println(Arrays.toString(newArray));

    
}
    
}
