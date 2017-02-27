//#Patterns: java_junit_JUnitAssertionsShouldIncludeMessage

public class Foo extends TestCase {

    public void testSomething() {
        //#Warn: java_junit_JUnitAssertionsShouldIncludeMessage
        assertEquals("foo", "bar");
        // Use the form:
        assertEquals("Foo does not equals bar", "foo", "bar"); // instead
    }
}

