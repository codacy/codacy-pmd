In JUnit 3, the framework executed all methods which started with the word test as a unit test. In JUnit 4, only methods annotated with the @Test annotation are executed.

Ex:

public class MyTest {
    public void testBad() {
        doSomething();
    }

	@Test
    public void testGood() {
        doSomething();
    }
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/migrating.html#JUnit4TestShouldUseTestAnnotation)
