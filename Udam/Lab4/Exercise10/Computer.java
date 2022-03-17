package Udam.Lab4.Exercise10;

public class Computer {
    private String _brand;
    private String _model;
    private int _ramSize;
    private int _hhdSize;

    public String get_brand() {
        return _brand;
    }

    public void set_brand(String _brand) {
        this._brand = _brand;
    }

    public String get_model() {
        return _model;
    }

    public void set_model(String _model) {
        this._model = _model;
    }

    public int get_ramSize() {
        return _ramSize;
    }

    public void set_ramSize(int _ramSize) {
        this._ramSize = _ramSize;
    }

    public int get_hhdSize() {
        return _hhdSize;
    }

    public void set_hhdSize(int _hhdSize) {
        this._hhdSize = _hhdSize;
    }

    public Computer(String _brand, String _model, int _ramSize, int _hhdSize) {
        this._brand = _brand;
        this._model = _model;
        this._ramSize = _ramSize;
        this._hhdSize = _hhdSize;
    }

    public Computer(String _brand, String _model, int _ramSize) {
        this._brand = _brand;
        this._model = _model;
        this._ramSize = _ramSize;
    }

    public Computer(String _brand) {
        this._brand = _brand;
    }

    public Computer() {
    }

    public void printInfo() {
        System.out.println("**Computer Specification**");
        System.out.println("BRAND: " + this._brand);
        System.out.println("MODEL: " + this._model);
        System.out.println("RAM SIZE: " + this._ramSize);
        System.out.println("HDD SIZE: " + this._hhdSize);
    }
}
