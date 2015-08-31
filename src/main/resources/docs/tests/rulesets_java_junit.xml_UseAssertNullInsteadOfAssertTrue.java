//#Patterns: junit_UseAssertNullInsteadOfAssertTrue

public class FooTest extends TestCase {
    void testCode() {
        Object a = doSomething();

        //#Warn: junit_UseAssertNullInsteadOfAssertTrue
        assertTrue(a==null); // bad usage

        assertNull(a); // good usage

        //#Warn: junit_UseAssertNullInsteadOfAssertTrue
        assertTrue(a != null); // bad usage

        assertNotNull(a); // good usage

    }
}