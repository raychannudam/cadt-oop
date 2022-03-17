package ex1;

    abstract public class Human{
    private String name, nationality;
    private int age;
    public static int counter=0;
    abstract public String getResponsible();
    // abstract public void addData();
    public Human(){}
    public Human(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }
    public String toString(){
        return this.getName()+"\t"+this.getAge();
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}