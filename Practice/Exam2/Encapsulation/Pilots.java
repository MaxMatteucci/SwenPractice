package Practice.Exam2.Encapsulation;

public class Pilots {
    private String pilotName;
    private int age;
    private int flightAmount;
    private double milesTaveled;
    private int amountCrashed;

    public Pilots(String pilotName, int age, int flightAmount, double milesTaveled, int amountCrashed)
    {
        this.pilotName=pilotName;
        this.age=age;
        this.flightAmount=flightAmount;
        this.milesTaveled=milesTaveled;
        this.amountCrashed=amountCrashed;
    }
    @Override
    public String toString() {
        return "Pilot Name: " + pilotName + " Age: " + age + " Amount of Flights: " + flightAmount + " Miles Traveled: " + milesTaveled + " Amount Crashed: " + amountCrashed;

    }

    public boolean isGoodPilot() {
        if (((double) amountCrashed/(double)flightAmount)>.05) {
            return false;
        }
        return true;
    }
    public String getName() {
        return this.pilotName;
    }
    public boolean isDonaldTrump() {
        if (pilotName.equals("Donald Trump")) {
            return true;
        }
        return false;
    }



    
}
