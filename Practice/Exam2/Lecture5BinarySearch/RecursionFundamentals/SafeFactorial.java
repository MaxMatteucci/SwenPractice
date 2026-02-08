package Practice.Exam2.Lecture5BinarySearch.RecursionFundamentals;

public class SafeFactorial {

    public static long factorial(int num) {
        if (num<0) {
            return -1;}

        else if (num==0) {
            return 1;
        }
        else {
            return num * factorial(num-1);
        }
        



    }
    public static void main(String[] args) {
        System.out.println(factorial(10));
        
    }
    
}
