package chapter6;

/**
 * Write a class that creates instances of Rectangle class to find the
 * total area of two rooms in a house.
 */

public class HomeAreaCalculator {

    public static void main(String[] args) {

        /*******************
         * RECTANGLE 1
         ******************/

        //Create instance of Rectangle class (with default constructor)
        Rectangle firstRoom = new Rectangle();
        firstRoom.setLength(10);
        firstRoom.setWidth(3);
        double firstRoomArea = firstRoom.calculateArea();

        /*******************
         * RECTANGLE 2
         ******************/

        //Create instance of Rectangle class
        Rectangle secondRoom = new Rectangle(4, 2.5);
        double secondRoomArea = secondRoom.calculateArea();

        double totalArea = firstRoomArea + secondRoomArea;
        System.out.println("Area of house is: " + totalArea);
    }
}
