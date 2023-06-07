import java.util.ArrayList;
import java.util.List;

public class Teacher implements Person {
    private int standard;
    private String division;
    private String sex;
    private List<String> subjects;

    public Teacher() {
        subjects = new ArrayList<>();
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

    public List<String> getSubjects() {
        return subjects;
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }
}
