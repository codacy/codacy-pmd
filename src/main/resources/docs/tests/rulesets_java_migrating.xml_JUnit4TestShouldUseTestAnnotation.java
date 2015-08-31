//#Patterns: migrating_JUnit4TestShouldUseTestAnnotation

public class MyTest {
    //#Warn: migrating_JUnit4TestShouldUseTestAnnotation
    public void testBad() {
        doSomething();
    }
    @Test public void testGood() {
        doSomething();
    }
}
