//#Patterns: category_java_design_SimplifyBooleanAssertion


public class SimpleTest extends TestCase {
    public void testX() {

        //#Warn: category_java_design_SimplifyBooleanAssertion
        assertTrue("not empty", !r.isEmpty());
        // replace with assertFalse("not empty", r.isEmpty())

        //#Warn: category_java_design_SimplifyBooleanAssertion
        assertFalse(!r.isEmpty());
        // replace with assertTrue(r.isEmpty())

    }
}
