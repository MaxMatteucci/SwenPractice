package Practice.Exam2.OneDimensionArrays;

public class ArrayInitialization {
    public static void main(String[] args) {
        
    
    int[] squaredArray=new int[10];

    for (int i=0; i<squaredArray.length; i++) {
        squaredArray[i]=i*i;
        System.out.print(squaredArray[i] + ", ");
    }

    
}}
