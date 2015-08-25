//#Patterns: rulesets_java_migrating.xml_JUnit4TestShouldUseTestAnnotation

public class MyTest {
    //#Warn: rulesets_java_migrating.xml_JUnit4TestShouldUseTestAnnotation
    public void testBad() {
        doSomething();
    }
    @Test public void testGood() {
        doSomething();
    }
}
