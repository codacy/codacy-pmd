//#Patterns: java_migrating_JUnit4TestShouldUseTestAnnotation

public class MyTest {
    //#Info: java_migrating_JUnit4TestShouldUseTestAnnotation
    public void testBad() {
        doSomething();
    }
    @Test public void testGood() {
        doSomething();
    }
}
