//#Patterns: category_java_bestpractices_JUnit4TestShouldUseAfterAnnotation

public class MyTest {
    //#Warn: category_java_bestpractices_JUnit4TestShouldUseAfterAnnotation
    public void tearDown() {
        bad();
    }
}
//public class MyTest2 { @After public void tearDown() { good(); } }
