package QuanLyLopHoc;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Class> classes = new ArrayList<>();

        // Sample data
        Class class1 = new Class("CNTT1");
        Student s1 = new Student("Nguyen", "An", "2000-01-01", "Hanoi", "CNTT1");
        s1.addSubjectScore("OOP", 9);
        s1.addSubjectScore("Project Management", 7.5);
        s1.addSubjectScore("Machine Learning", 8);
        s1.addSubjectScore("Database", 7);
        s1.addSubjectScore("Mobile Programming", 8.5);
        class1.addStudent(s1);

        Student s2 = new Student("Le", "Binh", "2000-05-12", "HCM", "CNTT1");
        s2.addSubjectScore("OOP", 5);
        s2.addSubjectScore("Project Management", 6);
        s2.addSubjectScore("Machine Learning", 5.5);
        s2.addSubjectScore("Database", 4.5);
        s2.addSubjectScore("Mobile Programming", 6);
        class1.addStudent(s2);

        classes.add(class1);
        Class class2 = new Class("CNTT1");
        Student s3 = new Student("Nguyen", "An", "2000-01-01", "Hanoi", "CNTT1");
        s3.addSubjectScore("OOP", 9);
        s3.addSubjectScore("Project Management", 7.5);
        s3.addSubjectScore("Machine Learning", 8);
        s3.addSubjectScore("Database", 7);
        s3.addSubjectScore("Mobile Programming", 8.5);
        class2.addStudent(s3);

        Student s4 = new Student("Le", "Binh", "2000-05-12", "HCM", "CNTT1");
        s4.addSubjectScore("OOP", 5);
        s4.addSubjectScore("Project Management", 6);
        s4.addSubjectScore("Machine Learning", 5.5);
        s4.addSubjectScore("Database", 4.5);
        s4.addSubjectScore("Mobile Programming", 6);
        class2.addStudent(s4);

        classes.add(class2);

        // Display available classes
        System.out.println("Available Classes:");
        for (Class c : classes) {
            System.out.println("- " + c.classCode);
        }

        // User selects a class
        System.out.print("Enter class code to view details: ");
        String selectedCode = scanner.nextLine();

        for (Class c : classes) {
            if (c.classCode.equalsIgnoreCase(selectedCode)) {
                System.out.println("\nStudents in class " + c.classCode + ":");
                c.printStudents();
                c.printRankSummary();
            }
        }
    }
}