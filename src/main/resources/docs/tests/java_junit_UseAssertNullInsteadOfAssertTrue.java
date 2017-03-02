//#Patterns: java_junit_UseAssertNullInsteadOfAssertTrue

public class FooTest extends TestCase {
    void testCode() {
        Object a = doSomething();

        //#Warn: java_junit_UseAssertNullInsteadOfAssertTrue
        assertTrue(a==null); // bad usage

        assertNull(a); // good usage

        //#Warn: java_junit_UseAssertNullInsteadOfAssertTrue
        assertTrue(a != null); // bad usage

        assertNotNull(a); // good usage

    }
}