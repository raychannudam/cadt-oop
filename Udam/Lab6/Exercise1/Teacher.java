package Udam.Lab6.Exercise1;

public class Teacher extends Human {
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

    public Teacher(String _name, String _age, String _nationality, Double salary, String schoolName) {
        super(_name, _age, _nationality);
        this.salary = salary;
        this.schoolName = schoolName;
    }

    public Teacher(Double salary, String schoolName) {
        this.salary = salary;
        this.schoolName = schoolName;
    }

    public Teacher() {
    }

    public String getResponsible() {
        return "Teach";
    }

    public String toString() {
        return ("This is a teacher with name: " + super.get_name() + "Work at " + this.schoolName + ". His salary is: " + this.salary + "His responsible is: " + getResponsible());
    }
}
