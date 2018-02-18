//#Patterns: category_java_bestpractices_JUnit4TestShouldUseTestAnnotation

public class MyTest {
    //#Warn: category_java_bestpractices_JUnit4TestShouldUseTestAnnotation
    public void testBad() {
        doSomething();
    }
    @Test public void testGood() {
        doSomething();
    }
}
