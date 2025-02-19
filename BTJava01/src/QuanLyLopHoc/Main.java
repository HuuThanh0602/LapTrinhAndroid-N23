package QuanLyLopHoc;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Class> classes = new ArrayList<>();

        // DuLieu
        Class class1 = new Class("CNTT1");
        Student s1 = new Student("Nguyen", "An", "2000-01-01", "Hanoi", "CNTT1");
        s1.addSubjectScore("OOP", 9);
        s1.addSubjectScore("QLDA", 7.5);
        s1.addSubjectScore("Machine Learning", 8);
        s1.addSubjectScore("CSDL", 7);
        s1.addSubjectScore("LTUDCTBDĐ", 8.5);
        class1.addStudent(s1);

        Student s2 = new Student("Le", "Binh", "2000-05-12", "HCM", "CNTT1");
        s2.addSubjectScore("OOP", 5);
        s2.addSubjectScore("QLDA", 6);
        s2.addSubjectScore("Machine Learning", 5.5);
        s2.addSubjectScore("CSDL", 4.5);
        s2.addSubjectScore("LTUDCTBDĐ", 6);
        class1.addStudent(s2);

        classes.add(class1);
        Class class2 = new Class("CNTT2");
        Student s3 = new Student("Nguyen", "Vy", "2000-02-01", "NinhBinh", "CNTT2");
        s3.addSubjectScore("OOP", 7);
        s3.addSubjectScore("QLDA", 6.5);
        s3.addSubjectScore("Machine Learning", 9);
        s3.addSubjectScore("CSDL", 7);
        s3.addSubjectScore("LTUDCTBDĐ", 8.5);
        class2.addStudent(s3);

        Student s4 = new Student("Le", "Binh", "2000-08-27", "HCM", "CNTT2");
        s4.addSubjectScore("OOP", 8);
        s4.addSubjectScore("QLDA", 6);
        s4.addSubjectScore("Machine Learning", 7.5);
        s4.addSubjectScore("CSDL", 9.5);
        s4.addSubjectScore("LTUDCTBDĐ", 6);
        class2.addStudent(s4);
        
        Student s5 = new Student("Tran", "Cuong", "2000-03-15", "Da Nang", "CNTT2");
        s5.addSubjectScore("OOP", 4);
        s5.addSubjectScore("QLDA", 6);
        s5.addSubjectScore("Machine Learning", 6.5);
        s5.addSubjectScore("CSDL", 5.5);
        s5.addSubjectScore("LTUDCTBDĐ", 6);
        class2.addStudent(s5);

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