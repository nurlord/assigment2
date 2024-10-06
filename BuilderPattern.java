// Product
class Car {
  private String engine;
  private int wheels;
  private String color;

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void showDetails() {
    System.out.println("Car with " + engine + ", " + wheels + " wheels and color " + color);
  }
}

// Builder Interface
interface CarBuilder {
  void buildEngine();

  void buildWheels();

  void buildColor();

  Car getResult();
}

// Concrete Builder
class SportsCarBuilder implements CarBuilder {
  private Car car = new Car();

  @Override
  public void buildEngine() {
    car.setEngine("V8");
  }

  @Override
  public void buildWheels() {
    car.setWheels(4);
  }

  @Override
  public void buildColor() {
    car.setColor("Red");
  }

  @Override
  public Car getResult() {
    return car;
  }
}

// Director
class CarDirector {
  private CarBuilder builder;

  public CarDirector(CarBuilder builder) {
    this.builder = builder;
  }

  public Car construct() {
    builder.buildEngine();
    builder.buildWheels();
    builder.buildColor();
    return builder.getResult();
  }
}
