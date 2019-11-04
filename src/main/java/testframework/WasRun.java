package testframework;

class WasRun {
    boolean wasSetUp;
    boolean wasRun;

    WasRun(boolean wasRun) {
        this.wasRun = wasRun;
    }

    void testMethod() {
        wasRun = true;
    }

    void run() {
        testMethod();
    }

    void setUp() {
        wasSetUp = true;
    }
}
