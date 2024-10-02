package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        // Create support levels
        SupportLevel basicSupport = new BasicSupport();
        SupportLevel supervisorSupport = new SupervisorSupport();
        SupportLevel managerSupport = new ManagerSupport();

        // Set the chain
        basicSupport.setNextLevel(supervisorSupport);
        supervisorSupport.setNextLevel(managerSupport);

        // Test with different requests
        SupportRequest request1 = new SupportRequest("Basic issue", 1);
        basicSupport.handleRequest(request1);

        SupportRequest request2 = new SupportRequest("Escalated issue", 2);
        basicSupport.handleRequest(request2);

        SupportRequest request3 = new SupportRequest("Critical issue", 3);
        basicSupport.handleRequest(request3);
    }
}
