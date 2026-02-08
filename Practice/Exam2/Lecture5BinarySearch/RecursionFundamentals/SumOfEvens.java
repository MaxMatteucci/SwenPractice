package Practice.Exam2.Lecture5BinarySearch.RecursionFundamentals;

public class SumOfEvens {

    public static int sumEvent(int num) {

        if (num<0) {
            return 0;
        }
        else if (num % 2 != 0) {
            return sumEvent(num-1);
        }
        else {
            return num+sumEvent(num-1);
        }



    }
    public static void main(String[] args) {
        System.out.println(sumEvent(5));
    }
    
}
