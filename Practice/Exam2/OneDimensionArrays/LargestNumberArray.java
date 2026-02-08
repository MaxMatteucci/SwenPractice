package Practice.Exam2.OneDimensionArrays;

public class LargestNumberArray {
    public static void main(String[] args) {
        int[] arr = {4,6,7,8,12,15,32,1,2};

        int largestNumber=arr[0];

        for (int i=1;  i<arr.length; i++) {
            if (arr[i]>largestNumber) {
                largestNumber=arr[i];

            }

        }
        System.out.println(largestNumber);
    }
    
}
