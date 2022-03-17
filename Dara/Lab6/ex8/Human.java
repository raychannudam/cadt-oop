package ex8;

public abstract class Human {
    private String name, nationality;
    private int age;
    public Human(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
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
    abstract String getResponsible();
}
