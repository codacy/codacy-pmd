//#Patterns: category_java_bestpractices_UseAssertTrueInsteadOfAssertEquals

public class MyTestCase extends TestCase {
    public void testMyCase() {

        boolean myVar = true;

        assertTrue("myVar is true", myVar);

        //#Warn: category_java_bestpractices_UseAssertTrueInsteadOfAssertEquals
        assertEquals("myVar is true", true, myVar);

        //#Warn: category_java_bestpractices_UseAssertTrueInsteadOfAssertEquals
        assertEquals("myVar is false", false, myVar);
    }
}
