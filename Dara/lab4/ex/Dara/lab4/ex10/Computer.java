package ex10;

public class Computer {
    private String brand, model, ramSize, storageSize;

    public Computer() {
    }

    public Computer(String brand) {
        this.brand = brand;
    }

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Computer(String brand, String model, String ramSize) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
    }

    public Computer(String brand, String model, String ramSize, String storageSize) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }

    public String getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(String storageSize) {
        this.storageSize = storageSize;
    }
    
    public String toString(){
        return this.brand + " "+ this.model+ " "+ this.ramSize+ " "+ this.storageSize;
    }
    
}
