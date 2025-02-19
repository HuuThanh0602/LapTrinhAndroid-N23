package QuanLyLopHoc_CNTT;

public class Student {
    private String FirstName;
    private String LastName;
    private String Birthdate;
    private String Address;
    private double OPP;
    private double QLDA;
    private double ML;
    private double Android;
    private double CSDL;
    private String className;

    public Student() {
        this.FirstName = "";
        this.LastName = "";
        this.Birthdate = "";
        this.Address = "";
        this.className = "";
        this.OPP = 0;
        this.QLDA = 0;
        this.ML = 0;
        this.Android = 0;
        this.CSDL = 0;
    }

    public Student(String firstName, String lastName, String birthdate, String address, 
                   double opp, double qlda, double ml, double android, double csdl, String classname) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Birthdate = birthdate;
        this.Address = address;
        this.className = classname;
        this.OPP = opp;
        this.QLDA = qlda;
        this.ML = ml;
        this.Android = android;
        this.CSDL = csdl;
    }

    public double getAverageScore() {
        return (OPP + QLDA + ML + Android + CSDL) / 5;
    }

    public String getRank() {
        double avg = getAverageScore();
        if (avg >= 8.5) return "A";
        else if (avg >= 7.0) return "B";
        else if (avg >= 5.5) return "C";
        else if (avg >= 4.0) return "D";
        else return "<D";
    }

    public void displayInfo() {
        System.out.printf("%s %s - %s - Birthdate: %s - Address: %s - Avg: %.2f - Rank: %s%n", 
            FirstName, LastName, className, Birthdate, Address, getAverageScore(), getRank());
    }

    public String getClassName() {
        return className;
    }
}