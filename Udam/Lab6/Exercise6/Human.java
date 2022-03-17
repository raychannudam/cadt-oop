package Udam.Lab6.Exercise6;

public class Human implements DoAble {

    private String name;
    private Integer age;
    private String nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Human(String name, Integer age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public Human() {
    }

    public void doThis() {
        System.out.println("Human can sleep");
    }

    public void doThat() {
        System.out.println("Human can stand");
    }

    public String toString() {
        return ("Name: " + this.name + ", Age: " + this.age + ", Nationality: " + this.nationality);
    }

}
