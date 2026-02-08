package Practice.Exam2.Lecture5BinarySearch.RecursiveArrays;

public class CountOccurances {
    public static int countTarget(int target, int i) {
        int[] arr={0, 1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,6,0};

        

        if (i==arr.length) {
            return 0;}
            if (arr[i]==target) {
                return 1+countTarget(target, i+1);
            }
            else {
                return countTarget(target, i+1);
        }

        }

        
    
    public static void main(String[] args) {
        System.out.println(countTarget(1,0));
    }
    
}


