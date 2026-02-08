package Practice;

public class LongestIncrease {

    public static int longestRun(int[] array) {
        int maxCounter=1;
        int counter=1;

        for (int i=0; i<array.length-1; i++) {
            if (array[i]<= array[i+1]) {
                counter++;

                if (counter>maxCounter) {
                    maxCounter=counter;
                }}
                else {counter=1;}

            }
        return maxCounter;
        }
        


        
    

    public static void main(String[] args) {
        int[] newArray= {1, 2, 3, 2, 3, 4, 5, 6};
        System.out.println(longestRun(newArray));

    }
    
}
