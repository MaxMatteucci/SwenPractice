package Practice.Exam2.LoopFundamentals;
import java.util.Scanner;
public class loopFundamentals {

    public static void countDownThree(int num) {
        if (num>=0) {
            while (num>=0) {
                if (num % 3 ==0) {
                    num--;}
                else {System.out.println(num);
                    num--;
                }
                
                
            }
        }


    }

    

    public static void main(String[] args) {
        System.out.println("Enter a positive number.");
        Scanner userInput= new Scanner(System.in);
        int countdownNum=userInput.nextInt();
        countDownThree(countdownNum);

        userInput.close();
    
    }
    
}
