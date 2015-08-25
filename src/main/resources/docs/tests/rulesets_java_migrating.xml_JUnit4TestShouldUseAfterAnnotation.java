//#Patterns: rulesets_java_migrating.xml_JUnit4TestShouldUseAfterAnnotation

public class MyTest {
    //#Warn: rulesets_java_migrating.xml_JUnit4TestShouldUseAfterAnnotation
    public void tearDown() {
        bad();
    }
}
//public class MyTest2 { @After public void tearDown() { good(); } }