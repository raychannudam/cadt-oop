package ex7;
public class Student implements Comparable<Student>{
    public String id, name, department;
    public int gen;

    public Student() {
    }
    public Student(String id) {
        this.id = id;
    }
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    public Student(String id, String name, String department, int gen) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.gen = gen;
    }

    public String toString(){
        return this.id+ " " + this.name + " " + this.department + "" + this.gen;
    }

    public int compareTo(Student student){
        return this.gen;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getGen() {
        return gen;
    }
    public void setGen(int gen) {
        this.gen = gen;
    }
}