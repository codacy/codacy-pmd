Since: PMD 4.0

In JUnit 3, the framework executed all methods which started with the word test as a unit test. 
In JUnit 4, only methods annotated with the @Test annotation are executed.
In JUnit 5, one of the following annotations should be used for tests: @Test, @RepeatedTest, @TestFactory, @TestTemplate or @ParameterizedTest.

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
