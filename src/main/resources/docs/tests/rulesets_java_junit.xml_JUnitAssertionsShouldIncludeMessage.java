//#Patterns: rulesets_java_junit.xml_JUnitAssertionsShouldIncludeMessage

public class Foo extends TestCase {

    public void testSomething() {
        //#Warn: rulesets_java_junit.xml_JUnitAssertionsShouldIncludeMessage
        assertEquals("foo", "bar");
        // Use the form:
        assertEquals("Foo does not equals bar", "foo", "bar"); // instead
    }
}

