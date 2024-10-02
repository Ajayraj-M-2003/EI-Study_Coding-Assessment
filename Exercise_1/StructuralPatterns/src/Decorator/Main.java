package Decorator;


public class Main {
    public static void main(String[] args) {
        // Basic email notification
        Notification emailNotification = new EmailNotification();
        emailNotification.send("Your order has been placed!");

        System.out.println("---");

        // Email + SMS notification
        Notification emailAndSMS = new SMSNotification(new EmailNotification());
        emailAndSMS.send("Your order has been shipped!");

        System.out.println("---");

        // Email + SMS + Push notification
        Notification allNotifications = new PushNotification(new SMSNotification(new EmailNotification()));
        allNotifications.send("Your order has been delivered!");
    }
}
