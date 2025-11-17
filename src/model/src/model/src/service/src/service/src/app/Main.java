package app;

import model.Student;
import service.StudentManager;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==== Student Menu ====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Roll No: ");
                    int r = sc.nextInt(); sc.nextLine();
                    System.out.print("Name: ");
                    String n = sc.nextLine();
                    System.out.print("Email: ");
                    String e = sc.nextLine();
                    System.out.print("Course: ");
                    String c = sc.nextLine();
                    System.out.print("Marks: ");
                    double m = sc.nextDouble();

                    manager.addStudent(new Student(r, n, e, c, m));
                    break;

                case 2:
                    manager.viewAllStudents();
                    break;

                case 3:
                    System.out.print("Enter Roll No: ");
                    Student s = manager.searchStudent(sc.nextInt());
                    if (s != null) s.displayInfo();
                    else System.out.println("Not found.");
                    break;

                case 4:
                    System.out.print("Enter Roll No: ");
                    manager.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Roll No to Update: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Name: ");
                    String n2 = sc.nextLine();
                    System.out.print("Email: ");
                    String e2 = sc.nextLine();
                    System.out.print("Course: ");
                    String c2 = sc.nextLine();
                    System.out.print("Marks: ");
                    double m2 = sc.nextDouble();
                    manager.updateStudent(id, new Student(id, n2, e2, c2, m2));
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
