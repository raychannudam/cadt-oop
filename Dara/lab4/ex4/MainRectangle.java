package Dara.lab4.ex4;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle Rectangle1 = new Rectangle();
        Rectangle Rectangle2 = new Rectangle(14.4, 20.5);
        Rectangle Rectangle3 = new Rectangle(20.22, 30.12, "dark-blue");

        Rectangle1.printRec();
        Rectangle2.printRec();
        Rectangle3.printRec();
    }

}
