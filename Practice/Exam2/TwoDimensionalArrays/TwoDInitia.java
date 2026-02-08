package Practice.Exam2.TwoDimensionalArrays;

public class TwoDInitia {
    public static void main(String[] args) {
        
    
    int[][] twoDArray=new int[5][5];

    for (int i=0; i<5; i++) {
        for (int k=0; k<5; k++) {
            twoDArray[i][k]=1;
        }
        }

    for (int i=0; i<5; i++) {
        System.out.println();
        for (int k=0; k<5; k++) {
            System.out.print(twoDArray[i][k]);
        }
        }

    
}}
