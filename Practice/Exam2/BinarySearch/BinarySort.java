package Practice.Exam2.BinarySearch;

public class BinarySort {
    public static boolean binarySearch(int[] arr, int target) {

        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;

        while (start<=end) {
            if (arr[mid] < target) {
                start=mid+1;
                mid=(start+end)/2;
            }
            else if (arr[mid] > target) {
                end=mid-1;
                mid=(start+end)/2;
            }
            else {return true;}
        }





        return false;
            
        }
        public static void main(String[] args) {
            int[] coolArray={1,2,3,8,12,15,25};
            System.out.println(binarySearch(coolArray, 12));
        }


        

    }
    

