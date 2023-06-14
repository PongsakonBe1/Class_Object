public class Rectangle {
  /*
------------------------------
Rectangle without Encapsulation
------------------------------
  // property in this class
  double width;
  double height;
  String name;

  // Action
  public double computeArea() {
    double area;
    area = this.width * this.height;
    return area;
  }
  -------------------------------
  */

// ----------------------------
// Rectangle with Encapsulation
// ----------------------------

  // property in this class
  private double width;
  private double height; // this access can use just within this class
  protected String name; // this access can use within this class, packege and subclass

  // i.e. access modifier
  // String name --> this access is a "no modifier" it can use within this class and pakege
  // public String name --> this access can use around the world

  // default constructor
  public Rectangle () {
    this.width = 1.0;
    this.height = 1.0;
    this.name = "Rectangle Constructor";
  }

  // Overloading Constructor
  public Rectangle(double width, double height) {
    this.setSize(width, height);
    this.name = "Rectangel Overloading Constructor";
  }

  // Overloading Constructor
  public Rectangle(double width, double height, String name) {
    this.setSize(width, height);
    this.name = name;
  }

  // Setter
  public void setWidth(double width) {
    if(width == 0)
      this.width = 1.0; // set value must isn't zero  
    else 
      this.width = Math.abs(width); // set value always positive
  }

  public void setHeight(double height) {
    if(height == 0)
      this.height = 1.0; // set value must isn't zero 
    else 
      this.height = Math.abs(height); // set value always positive
  }

  // set width and height with 1 method
  public void setSize(double width, double height) { 
    this.setWidth(width);
    this.setHeight(height);
  }

  // Getter
  public double getWidth() {
    return this.width;
  }

  public double getHeight() {
    return this.height;
  }


  // Action in this class 
  public double computeArea() { // this method use to compute area of rectangle
    return this.width * this.height;
  }

  // Display of Rectangle class
  public void displayDetail() {
    System.out.println("===== Class Rectangle =====");
    System.out.println("Name: " + this.name);
    System.out.println("Width: " + this.width);
    System.out.println("Height: " + this.height);
    System.out.println("Area: " + this.computeArea());
    System.out.println("============================");
  }
// ----------------------------
}
