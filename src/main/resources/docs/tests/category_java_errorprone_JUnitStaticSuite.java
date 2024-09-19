//#Patterns: category_java_errorprone_JUnitStaticSuite

import junit.framework.*;

public class Foo extends TestCase {

    //#Warn: category_java_errorprone_JUnitStaticSuite
    public void suite() {}
    // oops, should be static

    //#Warn: category_java_errorprone_JUnitStaticSuite
    private static void suite() {} // oops, should be public
}
