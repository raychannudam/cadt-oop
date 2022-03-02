package Udam.Lab6.Exercise8;

public class Teacher extends Human implements MoveAble {
    private Double salary;
    private String schoolName;
    
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Teacher(String _name, Integer _age, String _nationality, Double salary, String schoolName) {
        super(_name, _age, _nationality);
        this.salary = salary;
        this.schoolName = schoolName;
    }

    public Teacher(Double salary, String schoolName) {
        this.salary = salary;
        this.schoolName = schoolName;
    }

    public Teacher(){}

    @Override
    public void moveLeft() {
        System.out.println("Teacher moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("Teacher moves right");
    }

    @Override
    public void moveUp() {
        System.out.println("Teacher moves up");
    }

    @Override
    public void moveDown() {
        System.out.println("Teacher moves down");
    }

    @Override
    public void getResponsible() {
       System.out.println("Teach");
        
    }

    public String toString(){
        return ("Name: "+super.get_name());
    }
    
}
