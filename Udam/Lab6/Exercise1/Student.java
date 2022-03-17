package Udam.Lab6.Exercise1;

public class Student extends Human {
    private String schoolName;
    private String skill;

    public Student(String _name, String _age, String _nationality, String schoolName, String skill) {
        super(_name, _age, _nationality);
        this.schoolName = schoolName;
        this.skill = skill;
    }

    public Student(String schoolName, String skill) {
        this.schoolName = schoolName;
        this.skill = skill;
    }

    public Student() {
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getResponsible() {
        return "Study";
    }

    public String toString() {
        return ("This is student with name: " + super.get_name() + " Student at: " + this.schoolName + " In major of: " + this.skill);
    }
}
