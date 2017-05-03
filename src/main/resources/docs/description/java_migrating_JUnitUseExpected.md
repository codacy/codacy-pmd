Since: PMD 4.0

In JUnit4, use the @Test(expected) annotation to denote tests that should throw exceptions.

Example(s):
```
public class MyTest {
	@Test
    public void testBad() {
        try {
            doSomething();
            fail("should have thrown an exception");
        } catch (Exception e) {
        }
    }

	@Test(expected=Exception.class)
    public void testGood() {
        doSomething();
    }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/migrating.html#JUnitUseExpected)
