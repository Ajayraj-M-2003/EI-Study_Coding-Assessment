package ChainOfResponsibility;

public abstract class SupportLevel {
    protected SupportLevel nextLevel;

    public void setNextLevel(SupportLevel nextLevel) {
        this.nextLevel = nextLevel;
    }

    public abstract void handleRequest(SupportRequest request);
}
