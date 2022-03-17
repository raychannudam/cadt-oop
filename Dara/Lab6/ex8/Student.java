package ex8;

public class Student extends Human implements Movable{
    String schoolName, skill;

    public Student(String name, String nationality, int age, String schoolName, String skill) {
        super(name, nationality, age);
        this.schoolName = schoolName;
        this.skill = skill;
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
    public String toString() {
        return this.getName() + "\t" + this.getAge() + "\t" + this.getNationality() + "\t" + this.schoolName + "\t"
                + this.skill + "\t" + this.getResponsible();
    }
    public String getResponsible(){
        return "Study";
    }

    //movable
    public void moveLeft(){System.out.println(this.getName()+" moves left.");}
    public void moveRight(){System.out.println(this.getName()+" moves Right.");}
    public void moveUp(){System.out.println(this.getName()+" moves Up.");}
    public void moveDown(){System.out.println(this.getName()+" moves Down.");}

}
