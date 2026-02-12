package Practice.Exam2.Lecture5BinarySearch;

public class CountUpAgain {

    public static int factorial(int num) {
        if (num==0) {
        return 1;}
        else {
            return  num * factorial(num-1);
        }

        



    
    }
    public static void main(String[] args) {
        int number=0;
        System.out.println(factorial(number));
    }

    
}
