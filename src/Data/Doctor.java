package Data;

public class Doctor extends Person {

    private double bonus;
    private int hours;
    private boolean isbonus;
    public Doctor (){

    }

    public Doctor(String name, String lastname, double salary, double bonus) {
        super(name, lastname, salary);
        this.bonus = bonus;
}

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Bonus: " + getBonus();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "bonus=" + bonus +
                "} " + super.toString();
    }
    @Override

    public double calculateSalary(){
        return getSalary()*hours;
    }

    public boolean haveBonus(){
        if(bonus !=0){
            return true;
        }else
            return false;
    }
}
