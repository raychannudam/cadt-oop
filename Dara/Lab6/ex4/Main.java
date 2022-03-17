package ex4;

import java.util.Scanner;

import ex3.Circle;
import ex3.MyShape;
import ex3.Rectangle;

public class Main {
    static int i=0;
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        MyShape myshapes[] = new MyShape[10];
        do {
            System.out.println("1.Add Rectangle");
            System.out.println("2.Add Circle");
            System.out.println("3.Search by Area");
            System.out.println("4.Print all");
            System.out.println("5.Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    if (i != 10) {
                        myshapes[i]=Rectangle.addData();
                        System.out.println(myshapes[i]);
                        i++;
                    } else
                        System.out.println("The array is full");
                }
                    break;
                case 2: {
                    if (i != 10) {
                        myshapes[i] = Circle.addData();
                        System.out.println(myshapes[i]);
                        i++;
                    } else
                        System.out.println("The array is full");
                }
                    break;
                case 3: {
                    Scanner searchArea = new Scanner(System.in);
                    System.out.println("Enter the are to be searched: ");
                    Double Area = searchArea.nextDouble();
                    boolean flag = false;
                    int j;
                    for(j=0;j<myshapes.length;j++){
                        if(myshapes[j].getArea()==Area){
                            flag=true;
                            break;
                        }
                    }
                    
                    if(flag){
                        System.out.println(myshapes[j]);
                    }else{
                        System.out.println("Shape not found!");
                    }
                }
                    break;
                case 4: {
                    for (MyShape MyShape : myshapes) {
                        System.out.println(MyShape);
                    }
                }
                    break;
                case 5: {
                    System.exit(0);
                }break;
                default: {
                    System.out.println("default");
                }break;
            }
            // input.close();
        } while (choice != 5 );
    }
}
