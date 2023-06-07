public class Student implements Person {
    private int standard;
    private String division;
    private String sex;
    private String rollNumber;
    private String studentName;

    public Student(String rollNumber, String studentName) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
    }

    @Override
    public int getStandard() {
        return standard;
    }

    @Override
    public void setStandard(int standard) {
        this.standard = standard;
    }

    @Override
    public String getDivision() {
        return division;
    }

    @Override
    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }
}
