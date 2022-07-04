import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         *
         * lvl 1
         * Sukurti VCS studentu registracijos sistema.
         * Tam reikes:
         * Objektines klases "Student"
         * Jos laukai: name, surname, age, phoneNo, email
         * konstruktorius - tuscias.
         *
         * reikes Getteriu (public),
         * Main klaseje pasinaudoje scanneriu surinkite studento duomenis po viena. T.y.
         * atspausdinam "Studento vardas ? "
         * - ivedam studento varda.
         * Pavarde?
         * -ivedam pavarde.
         * ir t.t.
         * (saugome Student objekte)
         *
         *pilnai suvedus studenta - ji isspausdinti su toString overrintu metodu.
         *
         * lvl 2
         * Sudėti visas apsaugas. Jeigu įvedę blogai amžių, prašome įvesti iš naujo (reikės while)
         * Galimybė suvesti kelis studentus.
         *
         * lvl 3
         * Sukurti pagalbinę klasę pavadinimu Validation skirtą laikyti statiniams metodams.
         * (Validation.name(cs.nextLine). Validuoti taip pat name, surname, age, phoneNo, email.
         * Validacija su telefono numeriu ir su emailu.
         * lvl4
         * valdiuoti phoneNr, email. Tinkantys formatai +3706, 86, 6. Ar yra @ , ar yra taskas po etos ar yra bent vienas simbolis.
         *
         */



        ArrayList<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();

        System.out.println("Įveskite studento vardą: ");
        student1.setName(scanner.nextLine());

        System.out.println("Įveskite studento pavardę: ");
        student1.setSurname(scanner.nextLine());


        do {
            System.out.println("Įveskite studento amžių: ");
            Scanner scanner1 = new Scanner(System.in);
            try {
                student1.setAge(scanner1.nextInt());

            } catch (Exception e) {
            }
        } while (Validation.ageValidation(student1.getAge()) == 0);


        System.out.println("Įveskite studento telefono numerį: ");
        student1.setPhoneNo(scanner.nextLine());

        System.out.println("Įveskite studento elektorninį paštą: ");
        student1.setEmail(scanner.nextLine());


        students.add(student1);
        System.out.println(students);


    }


}