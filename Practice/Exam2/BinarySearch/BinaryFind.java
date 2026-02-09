package Practice.Exam2.BinarySearch;

public class BinaryFind {

     public static boolean findValue(int n) {
        int[] arr ={1,2,3,4,5,6,7};
            
            for (int i=0; i<arr.length; i++) {
                if (arr[i]==n) {
                    return true;
                }
            }
            return false;
        }
    public static void main(String[] args) {
        System.out.println(findValue(8));
       
        
       
    }
    
}
