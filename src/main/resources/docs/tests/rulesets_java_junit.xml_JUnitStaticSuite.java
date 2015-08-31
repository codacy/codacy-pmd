//#Patterns: junit_JUnitStaticSuite

import junit.framework.*;

public class Foo extends TestCase {

    //#Warn: junit_JUnitStaticSuite
    public void suite() {}
    // oops, should be static

    //#Warn: junit_JUnitStaticSuite
    private static void suite() {} // oops, should be public
}