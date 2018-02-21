//#Patterns: category_java_bestpractices_UseAssertNullInsteadOfAssertTrue

public class FooTest extends TestCase {
    void testCode() {
        Object a = doSomething();

        //#Warn: category_java_bestpractices_UseAssertNullInsteadOfAssertTrue
        assertTrue(a==null); // bad usage

        assertNull(a); // good usage

        //#Warn: category_java_bestpractices_UseAssertNullInsteadOfAssertTrue
        assertTrue(a != null); // bad usage

        assertNotNull(a); // good usage

    }
}
