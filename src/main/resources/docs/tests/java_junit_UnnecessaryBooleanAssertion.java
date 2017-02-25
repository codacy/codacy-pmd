//#Patterns: java_junit_UnnecessaryBooleanAssertion

public class SimpleTest extends TestCase {
    public void testX() {
        //#Warn: java_junit_UnnecessaryBooleanAssertion
        assertTrue(true); // serves no real purpose

    }
}