package Udam.Lab6.Exercise8;

public abstract class Human {
    private String _name;
    private Integer _age;
    private String _nationality;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public Integer get_age() {
        return _age;
    }

    public void set_age(Integer _age) {
        this._age = _age;
    }

    public String get_nationality() {
        return _nationality;
    }

    public void set_nationality(String _nationality) {
        this._nationality = _nationality;
    }

    public Human(String _name, Integer _age, String _nationality) {
        this._name = _name;
        this._age = _age;
        this._nationality = _nationality;
    }

    public Human() {
    }

    public abstract void getResponsible();
}
