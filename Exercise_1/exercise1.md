# Behavioural Pattern:
## 1. Chain of Responsibility Pattern (Use Case 1)
Scenario:
Imagine a customer support system where support requests are handled by different support levels (like basic support, supervisor, and manager). If a support agent can't handle the request, it will pass the request up the chain until someone can handle it.
## 2. Strategy Pattern (Use Case 2)
Scenario:
Imagine a payment system where the user can select a different payment method, such as credit card, PayPal, or cryptocurrency. The payment method can be changed at runtime, and each method has a different implementation for making payments.

# Creational Pattern:
##1. Singleton Pattern (Use Case 1)
Scenario:
You want to ensure that only one instance of a DatabaseConnection class is created during the application's lifecycle, preventing multiple unnecessary connections to the database.
## 2. Builder Pattern (Use Case 2)
Scenario:
You want to build a complex object, such as a House, with optional parameters like the number of rooms, windows, doors, and a garden. The Builder Pattern allows constructing this complex object step by step, without having to deal with long, messy constructors.

# Structural Pattern:
## 1. Composite Pattern (Use Case 1)
Scenario:
You are building a file system where directories can contain both files and other directories (a tree-like structure). The Composite Pattern allows you to treat both individual files and directories uniformly (as a "component" of the file system), making it easier to handle hierarchical data.
## 2. Decorator Pattern (Use Case 2)
Scenario:
You have a basic notification system that sends notifications via email. Now, you want to extend the system to also send notifications via SMS or push notifications dynamically, without modifying the existing notification code. The Decorator Pattern allows adding behavior (e.g., sending SMS) to an object dynamically at runtime.
