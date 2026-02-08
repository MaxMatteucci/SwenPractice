package Practice.Exam2.Lecture5BinarySearch.RecursiveArrays;

public class ArraySum {

    public static int sumArray(int i) {
        int[] arr={1,2,3,8,9,2};

        if (i==arr.length) {
            return 0;

        }
        else {
            return arr[i]+sumArray(i+1);

        }



    }
    public static void main(String[] args) {
        System.out.println(sumArray(0));
    }
    
}
