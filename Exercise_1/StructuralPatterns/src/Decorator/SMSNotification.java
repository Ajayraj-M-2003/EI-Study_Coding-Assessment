package Decorator;

public class SMSNotification extends NotificationDecorator {
    public SMSNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message); // Send the original notification (email)
        System.out.println("Sending SMS notification: " + message); // Add SMS functionality
    }
}
