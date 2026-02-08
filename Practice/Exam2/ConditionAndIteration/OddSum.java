package Practice.Exam2.ConditionAndIteration;

public class OddSum {

    public static void main(String[] args) {
        int n=27; //Could use scanner but i know how to do it and just practicing.
        int sum=0;

        for (int i=1; i<=n; i++) {
            if (i % 2 !=0)  {
                sum=sum+i;
            }
        }
        System.out.println(sum);


    }

    
}
