package Udam.Lab4.Exercise9;

public class Dog {
    private String _name;
    private Double _weight;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public Double get_weight() {
        return _weight;
    }

    public void set_weight(Double _weight) {
        this._weight = _weight;
    }

    public Dog(String _name) {
        this._name = _name;
    }

    public Dog(String _name, Double _weight) {
        this._name = _name;
        this._weight = _weight;
    }

    public Dog() {

    }

    public void printInfo() {
        System.out.println("**Dog Info**");
        System.out.println("NAME: " + this._name);
        System.out.println("WEIGHT: " + this._weight);
    }
}
