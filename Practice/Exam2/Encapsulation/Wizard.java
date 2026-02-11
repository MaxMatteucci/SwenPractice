package Practice.Exam2.Encapsulation;

public class Wizard {
    private String name;
    private String wizClass;
    private int level;
    private int experiencePoints;

    public Wizard() {

    }
    @Override
    public String toString() {
        return "Name: " + name + " Level: " + level;
    }

    public static void main(String[] args) {
        Wizard wizard1= new Wizard();
        Wizard wizard2=new Wizard();
        System.out.println(wizard1.toString());
        System.out.println(wizard2.toString());
        

        
    }


    
}
