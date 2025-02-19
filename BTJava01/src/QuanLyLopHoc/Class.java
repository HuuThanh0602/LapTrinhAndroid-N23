package QuanLyLopHoc;

import java.util.*;

public class Class {
    String classCode;
    List<Student> students;

    public Class(String classCode) {
        this.classCode = classCode;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printRankSummary() {
        Map<String, Integer> rankCount = new HashMap<>();
        rankCount.put("A", 0);
        rankCount.put("B", 0);
        rankCount.put("C", 0);
        rankCount.put("D", 0);
        rankCount.put("<D", 0);

        for (Student student : students) {
            String rank = student.getRank();
            rankCount.put(rank, rankCount.get(rank) + 1);
        }

        System.out.println("Rank Summary:");
        for (Map.Entry<String, Integer> entry : rankCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
