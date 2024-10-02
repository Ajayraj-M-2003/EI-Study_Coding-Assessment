package ChainOfResponsibility;

public class SupervisorSupport extends SupportLevel {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel() == 2) {
            System.out.println("Supervisor handling request: " + request.getMessage());
        } else if (nextLevel != null) {
            nextLevel.handleRequest(request);
        }
    }
}