package ChainOfResponsibility;

public class BasicSupport extends SupportLevel {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel() == 1) {
            System.out.println("Basic support handling request: " + request.getMessage());
        } else if (nextLevel != null) {
            nextLevel.handleRequest(request);
        }
    }
}