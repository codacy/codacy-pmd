//#Patterns: category_java_errorprone_JUnitSpelling


import junit.framework.*;
public class Foo extends TestCase {
    //#Warn: category_java_errorprone_JUnitSpelling
    public void setup() {

    }// oops, should be setUp
    //#Warn: category_java_errorprone_JUnitSpelling
    public void TearDown() {

    } // oops, should be tearDown }

}

