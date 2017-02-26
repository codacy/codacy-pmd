A JUnit test assertion with a boolean literal is unnecessary since it always will evaluate to the same thing. Consider using flow control (in case of `assertTrue(false)` or similar) or simply removing statements like `assertTrue(true)` and `assertFalse(false)`. If you just want a test to halt after finding an error, use the `fail()` method and provide an indication message of why it did.

Ex:

```
public class SimpleTest extends TestCase {
	public void testX() {
		assertTrue(true);		 // serves no real purpose
	}
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/junit.html#UnnecessaryBooleanAssertion)
