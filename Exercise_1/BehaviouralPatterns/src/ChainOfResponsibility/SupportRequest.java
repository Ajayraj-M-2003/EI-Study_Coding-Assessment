package ChainOfResponsibility;

public class SupportRequest {
    private String message;
    private int level; // 1: Basic, 2: Supervisor, 3: Manager

    public SupportRequest(String message, int level) {
        this.message = message;
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public int getLevel() {
        return level;
    }
}
