package chapter6;

/**
 * private = no other code outside this class can access things that are marked as private
 * protected = no access modifier = only classes from this package can access
 * public = all packages have access
 *
 * encapsulation (and hiding) = to make your fields privet and makes a methods that are used to access those fields public
 *
 */

public class Rectangle {

    private double length;
    private double width;

    //default constructor: - named like class, no params within scope
    public Rectangle() {
        length = 0;
        width = 0;
    }

    //another constructor: - named like class
    public Rectangle(double length, double width) {
        this.length = length; // can be set this way
        setWidth(width);//or this way. these are different to demo alternative options
    }

    //getters:
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //setters:
    public void setLength(double length) {
        this.length = length; // use this because we already have the length within our scope
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }

}
