package Udam.Lab4.Exercise7;

public class Student {
    private String _id = "";
    private String _name = "";
    private String _department = "";
    private String _generation = "";
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public String get_name() {
        return _name;
    }
    public void set_name(String _name) {
        this._name = _name;
    }
    public String get_department() {
        return _department;
    }
    public void set_department(String _department) {
        this._department = _department;
    }
    public String getGeneration() {
        return _generation;
    }
    public void setGeneration(String generation) {
        this._generation = generation;
    }
    public Student(String _name) {
        this._name = _name;
    }
    public Student(String _id, String _name) {
        this._id = _id;
        this._name = _name;
    }
    public Student(String _id, String _name, String _department) {
        this._id = _id;
        this._name = _name;
        this._department = _department;
    }
    public Student(String _id, String _name, String _department, String generation) {
        this._id = _id;
        this._name = _name;
        this._department = _department;
        this._generation = generation;
    }
    public Student() {
    }
    public void printInfo(){
        System.out.println("Student Info: ");
        System.out.println("ID: "+this._id);
        System.out.println("NAME: "+this._name);
        System.out.println("DEPARTMENT: "+this._department);
        System.out.println("GENERATION: "+this._generation);
    }
}
