Since: PMD 3.1

This rule detects JUnit assertions in object references equality. These assertions should be made 
by more specific methods, like assertSame, assertNotSame.

Example(s):
```
public class FooTest extends TestCase {
    void testCode() {
        Object a, b;
        assertTrue(a == b); // bad usage
        assertSame(a, b);   // good usage
    }
}
```
