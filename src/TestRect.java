public class TestRect {
    public static void main(String[] args) throws Exception {
        Rectangle rect = new Rectangle(); // Default Constructor
        Rectangle rect2 = new Rectangle(30, 5); // Overloading Constructor (width, height)
        Rectangle rect3 = new Rectangle(10, 20, "Constructor 3"); // Overloading Constructor (width, height, name)

        // --------------------
        // without encapsulation
        // --------------------

        /* rect.width = 10;
        rect.height = 80;
        rect.name = "TCT33";

        System.out.println("width: " + rect.width);
        System.out.println("Height: " + rect.height);
        System.out.println("Area: " + rect.computeArea()); 
        */

        // --------------------
        // with encapsulation
        // --------------------
        /*
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.computeArea());
        */

        rect.displayDetail(); // display of default constructor
        rect2.displayDetail(); // display of overloading constructor (width, height)
        rect3.displayDetail(); // display of overloading constructor (width, height, name)

    }
}
