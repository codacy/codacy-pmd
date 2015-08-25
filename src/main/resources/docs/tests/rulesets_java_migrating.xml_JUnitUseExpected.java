//#Patterns: rulesets_java_migrating.xml_JUnitUseExpected

public class MyTest {

    @Test public void testBad() {
        try {
            doSomething();
            //#Warn: rulesets_java_migrating.xml_JUnitUseExpected
            fail("should have thrown an exception");
        } catch (Exception e) {
        }
    }

    @Test(expected=Exception.class) public void testGood() {
        doSomething();
    }
}
