package Practice.Exam2.BinarySearch;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;



    }



    public static void main(String[] args) {
        int[] arr = {2,2,8,12,1,12,2,4,6,8,9,10};

        int[] newArr= bubbleSort(arr);

        for (int i=0; i<newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    
}
