package ex8;

public class Teacher extends Human implements Movable{
    String schoolName;
    double salary;
    public Teacher(String name, String nationality, int age, String schoolName, double salary) {
        super(name, nationality, age);
        this.schoolName = schoolName;
        this.salary = salary;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString(){
        return this.getName()+"\t"+this.getAge()+"\t"+this.getNationality()+"\t"+this.schoolName+"\t$"+this.salary+"\t"+this.getResponsible();
    }
    //humans
    public String getResponsible(){
        return "Teach";
    }

    //movable
    public void moveLeft(){System.out.println(this.getName()+" moves left.");}
    public void moveRight(){System.out.println(this.getName()+" moves Right.");}
    public void moveUp(){System.out.println(this.getName()+" moves Up.");}
    public void moveDown(){System.out.println(this.getName()+" moves Down.");}
}
