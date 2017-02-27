//#Patterns: java_junit_SimplifyBooleanAssertion


public class SimpleTest extends TestCase {
    public void testX() {

        //#Warn: java_junit_SimplifyBooleanAssertion
        assertTrue("not empty", !r.isEmpty());
        // replace with assertFalse("not empty", r.isEmpty())

        //#Warn: java_junit_SimplifyBooleanAssertion
        assertFalse(!r.isEmpty());
        // replace with assertTrue(r.isEmpty())

    }
}