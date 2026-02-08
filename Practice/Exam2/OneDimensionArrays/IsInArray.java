package Practice.Exam2.OneDimensionArrays;
import java.util.Scanner;

public class IsInArray {

    public static int numInArray(int num) {
        int[] predeterminedArray={1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4};
        int count=0;

        for (int i=0; i<predeterminedArray.length; i++) {
            if (num==predeterminedArray[i]) {
                count++;
            }


        }
        return count;




}
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a whole number to find out how many times it is in predetermined array.");
    int functionInput=input.nextInt();
    System.out.println(numInArray(functionInput));
    input.close();
    
}


    
}
