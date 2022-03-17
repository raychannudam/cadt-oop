package ex8;

public class Dog implements Comparable<Dog>{
    private String name;
    private int weight;

    public Dog() {
    }
    public Dog(String name) {
        this.name = name;
    }
    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return this.name + " " + this.weight;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Dog dog){
        return this.weight;
    }
    public void setId(String next) {
    }
    public void setDepartment(String nextLine) {
    }
    
}
