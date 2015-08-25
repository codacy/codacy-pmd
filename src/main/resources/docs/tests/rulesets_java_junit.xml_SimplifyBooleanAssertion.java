//#Patterns: rulesets_java_junit.xml_SimplifyBooleanAssertion


public class SimpleTest extends TestCase {
    public void testX() {

        //#Warn: rulesets_java_junit.xml_SimplifyBooleanAssertion
        assertTrue("not empty", !r.isEmpty());
        // replace with assertFalse("not empty", r.isEmpty())

        //#Warn: rulesets_java_junit.xml_SimplifyBooleanAssertion
        assertFalse(!r.isEmpty());
        // replace with assertTrue(r.isEmpty())

    }
}