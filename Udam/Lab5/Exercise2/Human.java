package Udam.Lab5.Exercise2;

public class Human {
    private String name;
    private Integer age;

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

    public Human(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
    }

    public void printAll() {
        System.out.println("NAME: " + this.name);
        System.out.println("AGE: " + this.age);
    }
}
