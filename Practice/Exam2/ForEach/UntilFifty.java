package Practice.Exam2.ForEach;

public class UntilFifty {
    public static void main(String[] args) {
        int[] arr={1,2,3,12,15,8,51,50,100,49,102};

        for (int num: arr) {
            if (num>50) {
                System.out.println(num);
            }
        }
    }
    
}
