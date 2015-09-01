This rule detects JUnit assertions in object references equality. These assertions should be made by more specific methods, like assertSame, assertNotSame.

Ex:


public class FooTest extends TestCase {
 void testCode() {
  Object a, b;
  assertTrue(a == b); // bad usage
  assertSame(a, b);  // good usage
 }
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/junit.html#UseAssertSameInsteadOfAssertTrue)
