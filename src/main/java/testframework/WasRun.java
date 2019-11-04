package testframework;

class WasRun {
    boolean wasRun;

    WasRun(boolean wasRun) {
        this.wasRun = wasRun;
    }

    void testMethod() {
        wasRun = true;
    }

    public void run() {
        testMethod();
    }
}
