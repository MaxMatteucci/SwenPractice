package Practice.Exam2.Lecture5BinarySearch.RecursionFundamentals;

public class AbsoluteValue {

    public static int absVal(int num) {
        if (num<0) {
            return absVal(-num);
        }



        return num;
    }

    public static void main(String[] args) {
        int num=1;
        System.out.println(absVal(num));
    }
    
}
