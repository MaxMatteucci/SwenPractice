package Practice;

public class RecursionPractice {
    public static int arraySum(int[] arr, int index, int total) {
        if (index < arr.length) {
        total+=arr[index];
        index++;
        return arraySum(arr, index, total);}
        
        

        else {
                 return total;
        }
   

        
    
    }

    public static void main(String[] args) {

        int[] array={1,4,8,12,15,12,1,4,8};
        System.out.println(arraySum(array, 0, 0));
        
    }

    
}

