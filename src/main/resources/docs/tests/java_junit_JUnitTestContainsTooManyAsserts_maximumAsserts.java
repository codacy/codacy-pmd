//#Patterns: java_junit_JUnitTestContainsTooManyAsserts: {"maximumAsserts": 2}

public class MyTestCase extends TestCase {
    // Ok
    public void testMyCaseWithOneAssert() {
        boolean myVar = false;
        assertFalse("should be false", myVar);
    }
    // Ok (assuming max > 1)
    public void testMyCaseWithMoreAsserts() {
        boolean myVar = false;
        assertFalse("myVar should be false", myVar);
        assertEquals("should equals false", false, myVar);
    }

    // Bad, too many asserts (assuming max=2)
    //#Warn: java_junit_JUnitTestContainsTooManyAsserts
    public void testMyCaseWithMoreAsserts() {
        boolean myVar = false;
        assertFalse("myVar should be false", myVar);
        assertEquals("should equals false", false, myVar);
        assertEquals("should equals true", true, myVar);
    }
}