public class Box extends Rectangle {
  // use keyword "extends" for inherit property and actions from superclass

  /*
  ! if you need to call property or action from superclass. you should call via keyword "super"
  ! but if you need to call property or action from this class. you can call via keyword "this"
  */

  // property
  private double depth;

  // Constructor
  public Box() { // default constructor
    super(); // this is default constructor in superclass (Rectangle)
    this.depth = 1.0;
  }

  public Box(double width, double height, double depth) { // overloading constructor
    super(width, height); // this is overloading constructor in superclass (Rectangle)
    this.depth = depth;
  }

  // setter
  public void setDepth(double depth) {
    if (depth == 0)
      this.depth = 1.0; // set value must isn't zero 
    else
      this.depth = Math.abs(depth); // set value always positive
  }

  public void setSize(double width, double height, double depth) { // this method is Overriding method (overriding from superclass)
    super.setSize(width, height); // you can use setSize method from superclass for set width and height 
    this.setDepth(depth);
  }
  // getter
  public double getDepth() {
    return this.depth;
  }

  // Action
  public double computeVolume() { // width * height * depth
    return super.computeArea() * this.depth;
  }

  // Display 
  public void displayDetail() { // overriding method from superclass(Rectangle)
    System.out.println("===== Class Box =====");
    System.out.println("Width: " + super.getWidth());
    System.out.println("Height: " + super.getHeight());
    System.out.println("Depth: " + this.getDepth());
    System.out.println("Volumn: " + this.computeVolume());
    System.out.println("======================");
  }

}
