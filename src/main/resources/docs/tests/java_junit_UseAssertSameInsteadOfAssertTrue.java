//#Patterns: java_junit_UseAssertSameInsteadOfAssertTrue

public class FooTest extends TestCase {
    void testCode() {
        Object a, b;

        //#Warn: java_junit_UseAssertSameInsteadOfAssertTrue
        assertTrue(a == b); // bad usage

        assertSame(a, b); // good usage

    }
}