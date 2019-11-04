package testframework;

class WasRun {
    boolean wasSetUp;
    boolean wasRun;
    String log = "setUp ";

    WasRun(boolean wasRun) {
        this.wasRun = wasRun;
    }

    void testMethod() {
        wasRun = true;
        log += "testMethod ";
    }

    void run() {
        testMethod();
    }

    void setUp() {
        wasSetUp = true;
    }

    void tearDown() {
        log +="tearDown ";
    }
}
