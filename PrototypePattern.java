// Prototype interface
abstract class Shape implements Cloneable {
  public String type;

  abstract void draw();

  @Override
  public Shape clone() {
    try {
      return (Shape) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
      return null;
    }
  }
}

// Concrete Prototype
class Circle extends Shape {
  public Circle() {
    this.type = "Circle";
  }

  @Override
  void draw() {
    System.out.println("Drawing a Circle");
  }
}

// Concrete Prototype
class Rectangle extends Shape {
  public Rectangle() {
    this.type = "Rectangle";
  }

  @Override
  void draw() {
    System.out.println("Drawing a Rectangle");
  }
}
