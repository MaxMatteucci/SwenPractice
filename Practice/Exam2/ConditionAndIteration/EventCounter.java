package Practice.Exam2.ConditionAndIteration;
import java.util.Scanner;

public class EventCounter {
    public static void main(String[] args) {
        System.out.println("Enter a whole number greater than 0: ");
        Scanner input= new Scanner(System.in);
        int topNum=input.nextInt();
        int count=0;

        for (int i=topNum; i>=0; i--) {
            if (i % 2 ==0) {
                count++;
            }

        }
        System.out.println(count);
        input.close();

    
    }

    
}
