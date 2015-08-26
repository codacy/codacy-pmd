This rule detects JUnit assertions in object equality. These assertions should be made by more specific methods, like assertEquals.

Ex:

public class FooTest extends TestCase {
	void testCode() {
		Object a, b;
		assertTrue(a.equals(b)); 					// bad usage
		assertEquals(?a should equals b?, a, b);	// good usage
	}
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/junit.html#UseAssertEqualsInsteadOfAssertTrue)
