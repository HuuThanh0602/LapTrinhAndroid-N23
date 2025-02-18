package QuanLyLopHoc;
import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private String classId;
    private List<Student> students;

    public ClassRoom(String classId) {
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

        System.out.println("\nThống kê xếp loại lớp " + classId + ":");
        System.out.println("A: " + aCount + " | B: " + bCount + " | C: " + cCount + " | D: " + dCount + " | <D: " + underDCount);
    }

    public String getClassId() {
        return classId;
    }
}
