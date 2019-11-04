package testframework;

class TestCase extends WasRun {

    TestCase(boolean wasRun) {
        super(wasRun);
    }

    public void run() {
        super.setUp();
        testMethod();
        super.tearDown();
    }
}
