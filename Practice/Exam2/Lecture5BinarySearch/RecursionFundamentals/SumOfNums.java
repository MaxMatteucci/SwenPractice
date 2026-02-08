package Practice.Exam2.Lecture5BinarySearch.RecursionFundamentals;

public class SumOfNums {
    public static int sumNum(int n) {
        if (n<=0) {
            return 0;}
        else {
            return n+sumNum(n-1);
        }

        }
    public static void main(String[] args) {
        System.out.println(sumNum(5));
    }

    }

     
    

