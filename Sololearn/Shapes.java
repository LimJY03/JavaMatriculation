/* You are working on a graphical app, which includes multiple different shapes.
 * The given code declares a base Shape class with an abstract area() method and a width attribute.
 * You need to create two Shape subclasses, Square and Circle, which initialize the width attribute using their constructor, and define their area() methods.
 * The area() for the Square class should output the area of the square (the square of the width), while for the Circle, it should output the area of the given circle (PI*width*width).
 * The code in main creates two objects with the given user input and calls the area() methods.
 */
import java.util.Scanner;
import java.lang.Math;

class Shapes{}

abstract class Shape{
    
    int width;
    abstract void area();
}

//your code goes here
public class Square extends Shape{
    public Square(int x){
        width = x;
    }
    
    public void area(){
        System.out.print(width * width);
    }
}

public class Circle extends Shape{

    public Circle(int x){
        width = x;
    }
    
    public void area(){
        System.out.print(Math.PI * width * width);
    }
}

class Program{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();

        sc.close();
    }
}