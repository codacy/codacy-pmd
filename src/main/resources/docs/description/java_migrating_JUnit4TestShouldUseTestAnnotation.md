Since: PMD 4.0

In JUnit 3, the framework executed all methods which started with the word test as a unit test. 
In JUnit 4, only methods annotated with the @Test annotation are executed.

Example(s):
```
public class MyTest {
    public void testBad() {
        doSomething();
    }

	@Test
    public void testGood() {
        doSomething();
    }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/migrating.html#JUnit4TestShouldUseTestAnnotation)
