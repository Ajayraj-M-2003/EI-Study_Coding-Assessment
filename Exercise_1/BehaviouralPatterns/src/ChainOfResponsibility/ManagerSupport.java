package ChainOfResponsibility;

public class ManagerSupport extends SupportLevel {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel() == 3) {
            System.out.println("Manager handling request: " + request.getMessage());
        } else {
            System.out.println("Request level is too high. No one can handle it.");
        }
    }
}