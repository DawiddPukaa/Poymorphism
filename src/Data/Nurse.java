package Data;

public class Nurse extends Person {
   private double overtime;

    public Nurse(String name, String lastname, double salary, double overtime) {
        super(name, lastname, salary);
        this.overtime = overtime;
    }

    public Nurse(){

    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    @Override

    public String getInfo(){
        return super.getInfo()+"Nadgodziny: "+getOvertime();
        }

    @Override
    public String toString() {
        return "Nurse{" +
                "overtime=" + overtime +
                "} " + super.toString();
    }
}
