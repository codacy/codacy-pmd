//#Patterns: java_junit_UseAssertTrueInsteadOfAssertEquals

public class MyTestCase extends TestCase {
    public void testMyCase() {

        boolean myVar = true;

        assertTrue("myVar is true", myVar);

        //#Warn: java_junit_UseAssertTrueInsteadOfAssertEquals
        assertEquals("myVar is true", true, myVar);

        //#Warn: java_junit_UseAssertTrueInsteadOfAssertEquals
        assertEquals("myVar is false", false, myVar);
    }
}