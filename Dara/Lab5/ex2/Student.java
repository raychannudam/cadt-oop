package ex2;

public class Student extends Human{
    public String studentId, schoolName, skill;

    public Student(String name, int age, String studentId, String schoolName, String skill) {
        super(name, age);
        this.studentId = studentId;
        this.schoolName = schoolName;
        this.skill = skill;
    }
    public String toString(){
        return this.getName()+"\t"+this.getAge()+"\t"+this.studentId+"\t"+this.schoolName+"\t"+this.skill;
    }
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
    
    
}
