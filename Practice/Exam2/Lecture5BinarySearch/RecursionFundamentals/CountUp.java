package Practice.Exam2.Lecture5BinarySearch.RecursionFundamentals;

public class CountUp {

    public static void countUpNum(int num) {
        

        if (num<=0) {
            return;
        }
        else {
            countUpNum(num-1);
            System.out.println(num);
        }
        

    }

    public static void main(String[] args) {
        int num=23;
        countUpNum(num);
    }
    
}
