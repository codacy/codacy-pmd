//#Patterns: rulesets_java_junit.xml_JUnitStaticSuite

import junit.framework.*;

public class Foo extends TestCase {

    //#Warn: rulesets_java_junit.xml_JUnitStaticSuite
    public void suite() {}
    // oops, should be static

    //#Warn: rulesets_java_junit.xml_JUnitStaticSuite
    private static void suite() {} // oops, should be public
}