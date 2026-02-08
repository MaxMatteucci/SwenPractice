package Practice;

public class CoolLooper {
    public static void main(String[] args) {
        
    
    int[] salesNumbers= {120,95,130,80,150,110,90};
    int sales=0;
    int lowCount=0;

    for (int i=0; i<salesNumbers.length; i++) {
        sales=sales+salesNumbers[i];
        if (salesNumbers[i] < 100) {
            lowCount++;
        }

    }
    System.out.println("Days with sales < 100: " + lowCount);
    System.out.println("Total sales: " + sales);

    if (sales/salesNumbers.length>=750/7) {
        System.out.println("Good Week!");}
    else {System.out.println("Bad Week!");}

    }



    }






        
    

    

