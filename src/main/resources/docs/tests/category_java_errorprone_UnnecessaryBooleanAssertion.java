//#Patterns: category_java_errorprone_UnnecessaryBooleanAssertion

public class SimpleTest extends TestCase {
    public void testX() {
        //#Warn: category_java_errorprone_UnnecessaryBooleanAssertion
        assertTrue(true); // serves no real purpose

    }
}
