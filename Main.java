import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Teacher teacherA = new Teacher();
        teacherA.addSubject("Math");

        Teacher teacherB = new Teacher();
        teacherB.addSubject("Science");

        Teacher teacherC = new Teacher();
        teacherC.addSubject("History");

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacherA);
        teachers.add(teacherB);
        teachers.add(teacherC);


        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for Student " + i + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Sex: ");
            String sex = scanner.nextLine();
            System.out.print("Standard: ");
            int standard = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Division: ");


        }
    }
}
