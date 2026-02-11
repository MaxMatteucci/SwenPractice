package Practice.Exam2.Encapsulation;

public class Main {

    public static void main(String[] args) {
        Wizard wizard1= new Wizard();
        Wizard wizard2=new Wizard();
        System.out.println(wizard1.toString());
        System.out.println(wizard2.toString());


        Pilots destiny= new Pilots("Destiny Schmidt", 28, 124, 1209484.83, 10);
        Pilots trump= new Pilots("Donald Trump", 74, 0, 0, 0);

        System.out.println(destiny.toString());
        System.out.println(destiny.isGoodPilot());
        System.out.println(trump.isDonaldTrump());

        
    
}}
