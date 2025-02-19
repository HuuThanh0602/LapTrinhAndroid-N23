package QuanLyLopHoc_CNTT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Classroom> classRooms = new ArrayList<>();

        classRooms.add(new Classroom("CNTT1"));
        classRooms.add(new Classroom("CNTT2"));
        classRooms.add(new Classroom("CNTT3"));

        classRooms.get(0).addStudent(new Student("Hoa", "Nguyen", "2004-01-10", "Hà Nội", 8.0, 8.5, 3.0, 7.5, 9.0, "CNTT1"));
        classRooms.get(0).addStudent(new Student("Linh", "Tran", "2004-02-20", "TP HCM", 7.0, 6.5, 8.0, 7.0, 7.5, "CNTT1"));

        classRooms.get(1).addStudent(new Student("Phuong", "Le", "2004-05-15", "Huế", 5.0, 4.5, 6.0, 4.5, 6.0, "CNTT2"));
        classRooms.get(1).addStudent(new Student("Lan", "Pham", "2004-04-25", "Cần Thơ", 3.0, 4.0, 3.5, 2.5, 3.0, "CNTT2"));

        classRooms.get(2).addStudent(new Student("Tuan", "Vo", "2004-06-12", "Hải Phòng", 8.0, 7.5, 8.5, 8.0, 8.5, "CNTT3"));
        classRooms.get(2).addStudent(new Student("Mai", "Pham", "2004-09-30", "Bình Định", 6.5, 6.0, 7.0, 6.5, 7.0, "CNTT3"));

        System.out.println("Danh sách lớp hiện có:");
        for (Classroom classroom : classRooms) {
            System.out.println("- " + classroom.getClassId());
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nNhập mã lớp để xem danh sách sinh viên (hoặc nhập 'exit' để thoát): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Chương trình kết thúc.");
                break;
            }

            Classroom selectedClass = null;
            for (Classroom classroom : classRooms) {
                if (classroom.getClassId().equals(input)) {
                    selectedClass = classroom;
                    break;
                }
            }

            if (selectedClass != null) {
                selectedClass.printStudentList();
                selectedClass.printRankSummary();
            } else {
                System.out.println("Lớp không tồn tại, vui lòng nhập lại!");
            }
        }

        scanner.close();
    }
}
