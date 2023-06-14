public class TestOverride {
  public static void main(String[] args) throws Exception {
    Rectangle rect = new Rectangle(10, 5); // superclass object
    Box myBox = new Box(10, 5, 3); // subclass object

    rect.displayDetail();
    myBox.displayDetail(); // this method is overriding from rectangle class

    rect = myBox; // now, rect is a object of Box class
    rect.displayDetail(); // Which displayDetail() is going to be called. This will be determined at run-time
  }
}
