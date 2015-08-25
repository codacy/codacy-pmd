//#Patterns: rulesets_java_junit.xml_UseAssertNullInsteadOfAssertTrue

public class FooTest extends TestCase {
    void testCode() {
        Object a = doSomething();

        //#Warn: rulesets_java_junit.xml_UseAssertNullInsteadOfAssertTrue
        assertTrue(a==null); // bad usage

        assertNull(a); // good usage

        //#Warn: rulesets_java_junit.xml_UseAssertNullInsteadOfAssertTrue
        assertTrue(a != null); // bad usage

        assertNotNull(a); // good usage

    }
}