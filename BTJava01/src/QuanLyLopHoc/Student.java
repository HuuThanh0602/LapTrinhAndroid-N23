package QuanLyLopHoc;

import java.util.*;

public class Student {
    String firstName;
    String lastName;
    String birthDate;
    String address;
    String classCode;
    Map<String, Double> subjects;

    public Student(String firstName, String lastName, String birthDate, String address, String classCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.classCode = classCode;
        this.subjects = new HashMap<>();
    }

    public void addSubjectScore(String subject, double score) {
        subjects.put(subject, score);
    }

    public double getAverageScore() {
        double total = 0;
        for (double score : subjects.values()) {
            total += score;
        }
        return total / subjects.size();
    }

    public String getRank() {
        double avg = getAverageScore();
        if (avg >= 8.5) return "A";
        else if (avg >= 7) return "B";
        else if (avg >= 5.5) return "C";
        else if (avg >= 4) return "D";
        else return "<D";
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - Avg Score: " + getAverageScore() + " - Rank: " + getRank();
    }
}