//#Patterns: migrating_JUnitUseExpected

public class MyTest {

    @Test public void testBad() {
        try {
            doSomething();
            //#Warn: migrating_JUnitUseExpected
            fail("should have thrown an exception");
        } catch (Exception e) {
        }
    }

    @Test(expected=Exception.class) public void testGood() {
        doSomething();
    }
}
