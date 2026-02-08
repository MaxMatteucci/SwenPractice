package Practice;

public class SumOfEvens {
    public static int evenSum(int[] array) {
        int sum=0;
        int oddSum=0;
        for (int i=0; i<array.length; i++) {
            if (array[i] % 2 == 0) {
                sum=sum+array[i];


            }
            else {oddSum=oddSum+array[i];

            }

        }
        return sum;

    }


    public static int recursionEvenSum(int[] array, int index) {
        if (index<array.length) {

            if (array[index] % 2 == 0) {
            return (array[index] + recursionEvenSum(array, index+1)); }
            else {
                return recursionEvenSum(array, index+1);}   
        }
        else 
            {return 0;}

    }

    public static void main(String[] args) {
        int[] sample = {3, 8, 5, 12, 7, 4,5,8};


        System.out.print(recursionEvenSum(sample,0));
    
    }
    
}
