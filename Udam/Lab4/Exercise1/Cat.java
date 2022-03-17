package Udam.Lab4.Exercise1;

public class Cat {
    private String _Name;
    public String _Color;

    public void setName(String name) {
        this._Name = name;
    }

    public String getName() {
        return this._Name;
    }

    public void cry() {
        System.out.println(_Name + " is crying Meow! Meow!");
    }
}
