//#Patterns: category_java_bestpractices_JUnitAssertionsShouldIncludeMessage

public class Foo extends TestCase {

    public void testSomething() {
        //#Warn: category_java_bestpractices_JUnitAssertionsShouldIncludeMessage
        assertEquals("foo", "bar");
        // Use the form:
        assertEquals("Foo does not equals bar", "foo", "bar"); // instead
    }
}

