package Data;

public class Hospital {
    static final int MAX_PERSONS = 3;
    private Person[] persons = new Person[MAX_PERSONS];
    private int numberEmployees = 0;

    public void addPerson(Person person){
        if(numberEmployees<MAX_PERSONS){
            persons[numberEmployees] = person;
            numberEmployees++;
        }
    }

    public String getInfo(){
        String result="";
        for(int i=0;i<numberEmployees;i++)

            result=result+persons[i].getInfo()+"\n";

        return result;
    }

}
