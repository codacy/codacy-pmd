//#Patterns: rulesets_java_migrating.xml_JUnit4TestShouldUseBeforeAnnotation
public class MyTest {
//#Warn: rulesets_java_migrating.xml_JUnit4TestShouldUseBeforeAnnotation
    public void setUp() {
        bad();
    }
}

//public class MyTest2 { @Before public void setUp() { good(); } }
