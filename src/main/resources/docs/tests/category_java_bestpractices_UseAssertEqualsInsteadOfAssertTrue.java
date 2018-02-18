//#Patterns: category_java_bestpractices_UseAssertEqualsInsteadOfAssertTrue

public class FooTest extends TestCase {
    void testCode() {
        Object a, b;
        //#Warn: category_java_bestpractices_UseAssertEqualsInsteadOfAssertTrue
        assertTrue(a.equals(b)); // bad usage
        //assertEquals(?a should equals b?, a, b); // good usage
    }
}
