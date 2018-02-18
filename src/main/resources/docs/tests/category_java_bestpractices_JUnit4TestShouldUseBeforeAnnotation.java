//#Patterns: category_java_bestpractices_JUnit4TestShouldUseBeforeAnnotation
public class MyTest {
//#Warn: category_java_bestpractices_JUnit4TestShouldUseBeforeAnnotation
    public void setUp() {
        bad();
    }
}

//public class MyTest2 { @Before public void setUp() { good(); } }
