// Create an abstract class `Notification` with method `sendNotification()`. Implement subclasses `EmailNotification` and `SMSNotification`.

abstract class Notification {
    abstract void sendNotification(String id);
}

class EmailNotification extends Notification {
    @Override
    public void sendNotification(String emailId) {
        System.out.println("Sending email to: " + emailId);
        System.out.println("Sending......");
    }
}

class SMSNotification extends Notification {
    @Override
    public void sendNotification(String mobileNo) {
        System.out.println("Sending sms to: " + mobileNo);
        System.out.println("Sending......");
    }
}

public class Main {
    public static void main(String[] args) {
        Notification n;

        n = new EmailNotification();
        n.sendNotification("ritik.g1999@gmail.com");

        n = new SMSNotification();
        n.sendNotification("9583938005");
    }
}