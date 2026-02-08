package Practice.Exam2.Lecture5BinarySearch.RecursionFundamentals;

public class PowerRecursion {

    public static int computePower(int num, int power) {

        if (power==0) {
            return 1;
        }

        else if (power>1){

            power--;
            return num*computePower(num, power);

        }

        return num;
        


    }


    public static void main(String[] args) {
        System.out.println(computePower(4, 3));
    }
    
}
