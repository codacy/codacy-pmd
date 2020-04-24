Since: PMD 3.1

This rule detects JUnit assertions in object equality. These assertions should be made by more specific methods, like assertEquals.

Example(s):
```
public class FooTest extends TestCase {
    void testCode() {
        Object a, b;
        assertTrue(a.equals(b));                    // bad usage
        assertEquals("a should equals b", a, b);    // good usage
    }
}
```
