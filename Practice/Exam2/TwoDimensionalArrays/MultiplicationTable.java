package Practice.Exam2.TwoDimensionalArrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        
    int[][] multiplyTable= new int[10][10];


    for (int i=0; i<multiplyTable.length; i++) {
        for (int k=0; k<multiplyTable[i].length; k++) {
            multiplyTable[i][k]=(i+1)*(k+1);

        }

        
    }
    for (int i=0; i<multiplyTable.length; i++) {
        System.out.println();
        for (int k=0; k<multiplyTable[i].length; k++) {

            if (multiplyTable[i][k] < 10) {
                System.out.print(multiplyTable[i][k]+"  ");
            }
            else{
            System.out.print(multiplyTable[i][k] + " ");}

    }
    
}}}
