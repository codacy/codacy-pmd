//#Patterns: junit_UseAssertSameInsteadOfAssertTrue

public class FooTest extends TestCase {
    void testCode() {
        Object a, b;

        //#Warn: junit_UseAssertSameInsteadOfAssertTrue
        assertTrue(a == b); // bad usage

        assertSame(a, b); // good usage

    }
}