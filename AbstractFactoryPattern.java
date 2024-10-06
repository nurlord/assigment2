// Abstract Products
interface Button {
  void paint();
}

interface Checkbox {
  void paint();
}

// Concrete Product for Mac
class MacButton implements Button {
  @Override
  public void paint() {
    System.out.println("Rendering a Mac Button");
  }
}

class MacCheckbox implements Checkbox {
  @Override
  public void paint() {
    System.out.println("Rendering a Mac Checkbox");
  }
}

// Concrete Product for Windows
class WindowsButton implements Button {
  @Override
  public void paint() {
    System.out.println("Rendering a Windows Button");
  }
}

class WindowsCheckbox implements Checkbox {
  @Override
  public void paint() {
    System.out.println("Rendering a Windows Checkbox");
  }
}

// Abstract Factory
interface GUIFactory {
  Button createButton();

  Checkbox createCheckbox();
}

// Concrete Factory for Mac
class MacFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new MacCheckbox();
  }
}

// Concrete Factory for Windows
class WindowsFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new WindowsCheckbox();
  }
}
