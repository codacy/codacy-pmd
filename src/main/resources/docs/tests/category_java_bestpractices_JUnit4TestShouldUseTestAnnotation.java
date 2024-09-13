//#Patterns: category_java_bestpractices_JUnit4TestShouldUseTestAnnotation

public class MyTest {
    //#Warn: category_java_bestpractices_JUnit4TestShouldUseTestAnnotation
    public void testBad() {
        doSomething();
    }
    //#Warn: category_java_bestpractices_JUnit4TestShouldUseTestAnnotation
    @Test public void testGood() {
        doSomething();
    }
}
