package Practice.Exam2.TwoDimensionalArrays;

public class RowSums {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5},{6,7,8,9,10},{8,12,19,20,19}, {8,9,12,15,18}, {1,8,9,12,13}};

        for (int i=0; i<arr.length; i++) {
            int sum=0;
            for (int k=0; k<arr[i].length; k++) {
                sum=sum+arr[i][k];

                if(k==arr[i].length-1) {
                    System.out.println("Row " + (i+1) + " sum is "+ sum);
                }
                

            }



        }

    //diagonals
        for (int i=0; i<arr.length; i++) {
            for (int k=0; k<arr[i].length; k++) {
                if (i==k) {
                    System.out.println(arr[i][k]);

                }
            }
        }


    }
    
}
