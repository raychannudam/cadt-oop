package Udam.Lab5.Exercise5;

public class Human {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Human(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
    }

    public String toString() {
        return ("This is " + this.name + "This year he/she is " + this.age + "years old.");
    }
}
