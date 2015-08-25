//#Patterns: rulesets_java_junit.xml_UnnecessaryBooleanAssertion

public class SimpleTest extends TestCase {
    public void testX() {
        //#Warn: rulesets_java_junit.xml_UnnecessaryBooleanAssertion
        assertTrue(true); // serves no real purpose

    }
}