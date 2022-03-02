package Udam.Lab6.Exercise8;

public class Student extends Human implements MoveAble {
    private String schoolName;
    private String skill;
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
    public Student(String _name, Integer _age, String _nationality, String schoolName, String skill) {
        super(_name, _age, _nationality);
        this.schoolName = schoolName;
        this.skill = skill;
    }
    public Student(String schoolName, String skill) {
        this.schoolName = schoolName;
        this.skill = skill;
    }
    public Student(){}
    @Override
    public void moveLeft() {
        System.out.println("Student move left");
    }
    @Override
    public void moveRight() {
        System.out.println("Student move right");
    }
    @Override
    public void moveUp() {
        System.out.println("Student move up");
    }
    @Override
    public void moveDown() {
        System.out.println("Student move down");
    }
    public void getResponsible(){
        System.out.println("Study");
    }
    public String toString(){
        return ("Name: "+super.get_name());
    }
    
}
