package QuanLyLopHoc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, ClassRoom> classRooms = new HashMap<>();
        classRooms.put("CNTT1", new ClassRoom("CNTT1"));
        classRooms.put("CNTT2", new ClassRoom("CNTT2"));

        classRooms.get("CNTT1").addStudent(new Student("Thanh", "Nguyen", "2004-05-10", "Hà Nội", 9.0, 8.5, 8.0, 7.5, 9.0, "CNTT1"));
        classRooms.get("CNTT1").addStudent(new Student("Binh", "Tran", "2004-07-20", "TP HCM", 7.0, 6.5, 8.0, 7.0, 7.5, "CNTT1"));

        classRooms.get("CNTT2").addStudent(new Student("Linh", "Le", "2004-03-15", "Đà Nẵng", 5.0, 4.5, 6.0, 5.5, 6.0, "CNTT2"));
        classRooms.get("CNTT2").addStudent(new Student("Dung", "Pham", "2004-08-25", "Cần Thơ", 3.0, 4.0, 3.5, 2.5, 3.0, "CNTT2"));

        System.out.println("Danh sách lớp hiện có:");
        for (String classId : classRooms.keySet()) {
            System.out.println("- " + classId);
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nNhập mã lớp để xem danh sách sinh viên (hoặc nhập 'exit' để thoát): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Chương trình kết thúc.");
                break;
            }
            
            ClassRoom selectedClass = classRooms.get(input);
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
