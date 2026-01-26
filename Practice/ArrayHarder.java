package Practice;
import java.util.Scanner;

public class ArrayHarder {

    public static int arrayMath(int num) {
        int[] newArray={3,7,12,5,18,9,20};
        int amountGreater=0;

        for(int i=0; i<newArray.length; i++) {
            if(num < newArray[i]) {
                amountGreater++;}}
        return amountGreater;

            }
        
    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNum=input.nextInt();
        System.out.println(arrayMath(userNum));
        input.close();
    }

    
}
