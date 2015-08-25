//#Patterns: rulesets_java_junit.xml_UseAssertSameInsteadOfAssertTrue

public class FooTest extends TestCase {
    void testCode() {
        Object a, b;

        //#Warn: rulesets_java_junit.xml_UseAssertSameInsteadOfAssertTrue
        assertTrue(a == b); // bad usage

        assertSame(a, b); // good usage

    }
}