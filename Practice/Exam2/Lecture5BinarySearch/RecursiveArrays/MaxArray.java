package Practice.Exam2.Lecture5BinarySearch.RecursiveArrays;

public class MaxArray {

    public static int maxArray(int maxNum, int i) {
        int[] arr= {2,2,3,8,12,1,2,4,23,1};

        if (i==arr.length) {
            return maxNum;
        }
        else {
            if (maxNum<arr[i]) {
                maxNum=arr[i];
                
            }
            return maxArray(maxNum, i+1);
            }
        }






    

public static void main(String[] args) {
    System.out.println(maxArray(0, 0));
}
    
    
}
