//#Patterns: rulesets_java_junit.xml_JUnitSpelling


import junit.framework.*;
public class Foo extends TestCase {
    //#Warn: rulesets_java_junit.xml_JUnitSpelling
    public void setup() {

    }// oops, should be setUp
    //#Warn: rulesets_java_junit.xml_JUnitSpelling
    public void TearDown() {

    } // oops, should be tearDown }

}

