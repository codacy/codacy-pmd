When asserting a value is the same as a boolean literal, use `assertTrue`/`assertFalse`, instead of `assertEquals`.

Ex:

```
public class MyTestCase extends TestCase {
	public void testMyCase() {
		boolean myVar = true;
		// Ok
		assertTrue("myVar is true", myVar);
		// Bad
		assertEquals("myVar is true", true, myVar);
		// Bad
		assertEquals("myVar is false", false, myVar);
	}
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/junit.html#UseAssertTrueInsteadOfAssertEquals)
