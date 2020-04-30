package App;

import Data.Doctor;
import Data.Hospital;
import Data.Nurse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class HospitalApp {
    public static void main(String[] args) throws IOException {

        String fileName = "lekarz.txt";

        File file = new File(fileName);

        //file.createNewFile();

        Doctor doctor = new Doctor("jan", "Kowalski", 10000, 2000);
        Nurse nurse = new Nurse("Jowita", "Stec", 3000, 5.0);
        System.out.println(doctor.haveBonus());
        Hospital hospital = new Hospital();
        hospital.addPerson(doctor);
        hospital.addPerson(nurse);
        System.out.println(hospital.getInfo());
        Scanner scanner = new Scanner(System.in);
        Doctor doctor1 = new Doctor();

        System.out.println("Podaj imie doktora: ");
        doctor1.setName(scanner.next());
        System.out.println("Podaj nazwisko doktora: ");
        doctor1.setLastname(scanner.next());
        System.out.println("Ile zarabia: ");
        doctor1.setSalary(scanner.nextInt());
        System.out.println("Jaki ma dostać bonus: ");
        doctor1.setBonus(scanner.nextInt());

        System.out.println(doctor1.getInfo());
        try (Scanner scanFile = new Scanner(file)) {
            while (scanFile.hasNextLine()) {
                String linia = scanFile.nextLine();
                String d[] = linia.split(";");

                Doctor doctor2 = new Doctor(d[0],d[1],Integer.parseInt(d[2]),Integer.parseInt(d[3]));
                System.out.println(doctor2.getInfo());
            }
        }catch (FileNotFoundException e){
            System.out.println("Brak pliku o nazwie: "+ fileName);
        }



    }
}
