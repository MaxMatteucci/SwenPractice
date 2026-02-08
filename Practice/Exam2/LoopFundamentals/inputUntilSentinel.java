package Practice.Exam2.LoopFundamentals;
import java.util.Scanner;
public class inputUntilSentinel{

    public static void inputUntil() {
        int x=0;
        Scanner inputScanner=new Scanner(System.in);
        do {
            System.out.println("enter a number to have it printed, -1 to close");
            x=inputScanner.nextInt();

            if (x != -1) {
            System.out.println(x); }}

        while (x!=-1);
        inputScanner.close();
    
    
        




        


    }


    public static void main(String[] args) {
        
        inputUntil();
    }







}