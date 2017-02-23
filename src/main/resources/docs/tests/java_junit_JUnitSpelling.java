//#Patterns: java_junit_JUnitSpelling


import junit.framework.*;
public class Foo extends TestCase {
    //#Warn: java_junit_JUnitSpelling
    public void setup() {

    }// oops, should be setUp
    //#Warn: java_junit_JUnitSpelling
    public void TearDown() {

    } // oops, should be tearDown }

}

