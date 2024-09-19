//#Patterns: category_java_bestpractices_JUnitTestsShouldIncludeAssert

public class Foo extends TestCase {

    //#Warn: category_java_bestpractices_JUnitTestsShouldIncludeAssert
    public void testSomething() {
        Bar b = findBar();

        // This is better than having a NullPointerException
        //assertNotNull("bar not found", b);
        b.work();
    }
}

