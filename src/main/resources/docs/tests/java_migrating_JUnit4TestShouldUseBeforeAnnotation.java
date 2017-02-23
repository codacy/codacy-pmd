//#Patterns: java_migrating_JUnit4TestShouldUseBeforeAnnotation
public class MyTest {
//#Info: java_migrating_JUnit4TestShouldUseBeforeAnnotation
    public void setUp() {
        bad();
    }
}

//public class MyTest2 { @Before public void setUp() { good(); } }
