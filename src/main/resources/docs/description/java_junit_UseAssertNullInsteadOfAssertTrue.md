Since: PMD 3.5

This rule detects JUnit assertions in object references equality. These assertions should be made by 
more specific methods, like assertNull, assertNotNull.

Example(s):
```
public class FooTest extends TestCase {
  void testCode() {
   Object a = doSomething();
   assertTrue(a==null); // bad usage
   assertNull(a);  // good usage
   assertTrue(a != null); // bad usage
   assertNotNull(a);  // good usage
  }
 }
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/junit.html#UseAssertNullInsteadOfAssertTrue)
