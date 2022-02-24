package Udam.Lab5.Exercise2;

public class Student extends Human{
    private String studentId;
    private String schoolName;
    private String skill;
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
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
    public Student(String name, Integer age, String studentId, String schoolName, String skill) {
        super(name, age);
        this.studentId = studentId;
        this.schoolName = schoolName;
        this.skill = skill;
    }
    public Student(String studentId, String schoolName, String skill) {
        this.studentId = studentId;
        this.schoolName = schoolName;
        this.skill = skill;
    }
    public Student(){
    }
    public void printAll(){
        System.out.println("NAME: "+super.getName());
        System.out.println("AGE: "+super.getAge());
        System.out.println("STUDENT ID: "+this.studentId);
        System.out.println("SCHOOL NAME: "+this.schoolName);
        System.out.println("SKILL: "+this.skill);
    }
}
