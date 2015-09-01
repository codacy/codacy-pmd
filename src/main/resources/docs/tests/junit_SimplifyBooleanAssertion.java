//#Patterns: junit_SimplifyBooleanAssertion


public class SimpleTest extends TestCase {
    public void testX() {

        //#Warn: junit_SimplifyBooleanAssertion
        assertTrue("not empty", !r.isEmpty());
        // replace with assertFalse("not empty", r.isEmpty())

        //#Warn: junit_SimplifyBooleanAssertion
        assertFalse(!r.isEmpty());
        // replace with assertTrue(r.isEmpty())

    }
}