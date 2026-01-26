package Practice;

public class ArrayComparison {
    public static void main(String[] args) {
        int[] array1= {2,4,6,8,10};
        int[] array2={1,2,3,4,5,6};
        int count=0;

        for(int i=0; i<array1.length;i++) {
            for(int j=0; j<array2.length;j++) {
                if (array1[i]==array2[j]) {
                    count++;
            }
        }}
    
    System.out.println(count);}}
        



