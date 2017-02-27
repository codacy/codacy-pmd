//#Patterns: java_migrating_JUnit4TestShouldUseAfterAnnotation

public class MyTest {
    //#Info: java_migrating_JUnit4TestShouldUseAfterAnnotation
    public void tearDown() {
        bad();
    }
}
//public class MyTest2 { @After public void tearDown() { good(); } }