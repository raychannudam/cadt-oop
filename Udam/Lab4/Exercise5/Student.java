package Udam.Lab4.Exercise5;

public class Student {
    private String _firstname;
    private String _lastname;
    private String _student_id;
    private String _address;

    public String get_firstname() {
        return _firstname;
    }

    public void set_firstname(String _firstname) {
        this._firstname = _firstname;
    }

    public String get_lastname() {
        return _lastname;
    }

    public void set_lastname(String _lastname) {
        this._lastname = _lastname;
    }

    public String get_student_id() {
        return _student_id;
    }

    public void set_student_id(String _student_id) {
        this._student_id = _student_id;
    }

    public String get_address() {
        return _address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }

    public Student(String _firstname, String _lastname, String _student_id, String _address) {
        this._firstname = _firstname;
        this._lastname = _lastname;
        this._student_id = _student_id;
        this._address = _address;
    }

    public Student(String _firstname, String _lastname, String _student_id) {
        this._firstname = _firstname;
        this._lastname = _lastname;
        this._student_id = _student_id;
    }

    public Student() {
    }

    public void printtInfo() {
        System.out.println("firstname: " + get_firstname());
        System.out.println("lastname: " + get_lastname());
        System.out.println("id: " + get_student_id());
        System.out.println("address: " + get_address());
    }

}
