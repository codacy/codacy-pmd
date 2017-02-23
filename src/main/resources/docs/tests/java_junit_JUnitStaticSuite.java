//#Patterns: java_junit_JUnitStaticSuite

import junit.framework.*;

public class Foo extends TestCase {

    //#Warn: java_junit_JUnitStaticSuite
    public void suite() {}
    // oops, should be static

    //#Warn: java_junit_JUnitStaticSuite
    private static void suite() {} // oops, should be public
}