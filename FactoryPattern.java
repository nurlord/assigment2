
// Abstract Product
interface Notification {
  void notifyUser();
}

// Concrete Products
class EmailNotification implements Notification {
  @Override
  public void notifyUser() {
    System.out.println("Sending an Email notification");
  }
}

class SMSNotification implements Notification {
  @Override
  public void notifyUser() {
    System.out.println("Sending an SMS notification");
  }
}

// Creator
abstract class NotificationFactory {
  public abstract Notification createNotification();
}

// Concrete Creator for Email
class EmailNotificationFactory extends NotificationFactory {
  @Override
  public Notification createNotification() {
    return new EmailNotification();
  }
}

// Concrete Creator for SMS
class SMSNotificationFactory extends NotificationFactory {
  @Override
  public Notification createNotification() {
    return new SMSNotification();
  }
}
