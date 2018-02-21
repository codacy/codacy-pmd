//#Patterns: category_java_bestpractices_UseAssertSameInsteadOfAssertTrue

public class FooTest extends TestCase {
    void testCode() {
        Object a, b;

        //#Warn: category_java_bestpractices_UseAssertSameInsteadOfAssertTrue
        assertTrue(a == b); // bad usage

        assertSame(a, b); // good usage

    }
}
