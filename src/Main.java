import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student("Samat", LocalDate.of(1938, 9, 8), 996003003, "Kyrgyz");
        Student stud2 = new Student("Kanat", LocalDate.of(1939, 3, 1), 996004004, "Russian");
        Student stud3 = new Student("Sanat", LocalDate.of(1940, 7, 6), 996005005, "Kazakh");
        Student stud4 = new Student("Manat", LocalDate.of(1941, 6, 4), 996006006, "Uzbek");
        Student stud5 = new Student("Talant", LocalDate.of(1942, 7, 2), 996007007, "Turkmon");

        Student[] stud = {stud1, stud2, stud3, stud4, stud5};
        for (Student i : stud) {
            System.out.println(i.getName() + "," + i.getDateOfBirth() + "," + i.getPhoneNumber() + "," + i.getNationality());
        }
        for (Student x : stud) {
            System.out.println(Period.between(LocalDate.now(), x.getDateOfBirth()).getYears());
        }
    }
}