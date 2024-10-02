package Decorator;


public class PushNotification extends NotificationDecorator {
    public PushNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message); // Send the original notification (email)
        System.out.println("Sending push notification: " + message); // Add push notification functionality
    }
}
