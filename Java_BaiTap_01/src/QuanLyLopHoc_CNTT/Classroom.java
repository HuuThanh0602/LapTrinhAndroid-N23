package QuanLyLopHoc_CNTT;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String classId;
    private List<Student> students;

    public Classroom(String classId) {  
        this.classId = classId;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student.getClassName().equals(this.classId)) {
            students.add(student);
        }
    }

    public void printStudentList() {
        System.out.println("\nDanh sách sinh viên lớp " + classId + ":");
        if (students.isEmpty()) {
            System.out.println("Không có sinh viên nào trong lớp.");
        } else {
            students.forEach(Student::displayInfo);
        }
    }

    public void printRankSummary() {
        long aCount = students.stream().filter(s -> s.getRank().equals("A")).count();
        long bCount = students.stream().filter(s -> s.getRank().equals("B")).count();
        long cCount = students.stream().filter(s -> s.getRank().equals("C")).count();
        long dCount = students.stream().filter(s -> s.getRank().equals("D")).count();
        long underDCount = students.stream().filter(s -> s.getRank().equals("<D")).count();

        System.out.println("\nThống kê xếp hạng:");
        System.out.println("Hạng A: " + aCount + " sinh viên");
        System.out.println("Hạng B: " + bCount + " sinh viên");
        System.out.println("Hạng C: " + cCount + " sinh viên");
        System.out.println("Hạng D: " + dCount + " sinh viên");
        System.out.println("Hạng < D: " + underDCount + " sinh viên");
    }

    public String getClassId() {
        return classId;
    }
}
