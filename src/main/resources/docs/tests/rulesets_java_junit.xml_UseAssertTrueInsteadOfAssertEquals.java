//#Patterns: rulesets_java_junit.xml_UseAssertTrueInsteadOfAssertEquals

public class MyTestCase extends TestCase {
    public void testMyCase() {

        boolean myVar = true;

        assertTrue("myVar is true", myVar);

        //#Warn: rulesets_java_junit.xml_UseAssertTrueInsteadOfAssertEquals
        assertEquals("myVar is true", true, myVar);

        //#Warn: rulesets_java_junit.xml_UseAssertTrueInsteadOfAssertEquals
        assertEquals("myVar is false", false, myVar);
    }
}