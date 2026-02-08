package Practice.Exam2.Lecture5BinarySearch.RecursionFundamentals;

public class CountDown {
    public static void Countdown(int n) {
        if (n>=0) {
            System.out.println(n);
            n--;
            Countdown(n);

            
        }
    }


    public static void main(String[] args) {
        int num=21;
        Countdown(num);
    }
    
}
