package Practice.Exam2.ConditionAndIteration;
import java.util.Scanner;

public class ValidationLoop {

    public static void oneThroughTen() {
        Scanner input=new Scanner(System.in);
       
        int num=-1;

        while (num < 1 || num>10) {
            System.out.println("Enter a whole number between 1 and 10:"); 
            num=input.nextInt();

        }
        System.out.println("Good job!  You can follow simple directions.");
        input.close();
        
        
        }
    public static void main(String[] args) {
        oneThroughTen();
    
    }


    }

    

