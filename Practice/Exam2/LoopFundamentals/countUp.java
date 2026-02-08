package Practice.Exam2.LoopFundamentals;
import java.util.Scanner;
public class countUp {
    
    public static void countUpFunction(int n) {
        if (n>0) {
            for (int i=0; i<=n; i=i+2) {
                System.out.println(i);
            }
        }



    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to count up to: ");
        int n=input.nextInt();
        countUpFunction(n);
        input.close();
    }
    
}
