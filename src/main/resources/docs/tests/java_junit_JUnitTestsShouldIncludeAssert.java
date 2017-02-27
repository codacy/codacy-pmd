//#Patterns: java_junit_JUnitTestsShouldIncludeAssert

public class Foo extends TestCase {

    //#Warn: java_junit_JUnitTestsShouldIncludeAssert
    public void testSomething() {
        Bar b = findBar();

        // This is better than having a NullPointerException
        //assertNotNull("bar not found", b);
        b.work();
    }
}

