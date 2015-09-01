//#Patterns: junit_UnnecessaryBooleanAssertion

public class SimpleTest extends TestCase {
    public void testX() {
        //#Warn: junit_UnnecessaryBooleanAssertion
        assertTrue(true); // serves no real purpose

    }
}