//#Patterns: rulesets_java_junit.xml_UseAssertEqualsInsteadOfAssertTrue

public class FooTest extends TestCase {
    void testCode() {
        Object a, b;
        //#Warn: rulesets_java_junit.xml_UseAssertEqualsInsteadOfAssertTrue
        assertTrue(a.equals(b)); // bad usage
        //assertEquals(?a should equals b?, a, b); // good usage
    }
}