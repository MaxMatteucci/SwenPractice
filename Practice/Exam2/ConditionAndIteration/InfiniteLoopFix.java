package Practice.Exam2.ConditionAndIteration;

public class InfiniteLoopFix {
    public static void main(String[] args) {
        int i=1;
        int count=0;
        while (i>0 && count<=9) {
            System.out.println(i);
            i++;
            count++;

        }
    }
    
}
