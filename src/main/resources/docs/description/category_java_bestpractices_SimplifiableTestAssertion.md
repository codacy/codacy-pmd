Since: PMD 6.37.0

Reports test assertions that may be simplified using a more specific
            assertion method. This enables better error messages, and makes the
            assertions more readable.

            The rule only applies within test classes for the moment. It replaces
            the deprecated rules {% rule UseAssertEqualsInsteadOfAssertTrue %},
            {% rule UseAssertNullInsteadOfAssertTrue %}, {% rule UseAssertSameInsteadOfAssertTrue %},
            {% rule UseAssertTrueInsteadOfAssertEquals %}, and {% rule java/design/SimplifyBooleanAssertion %}.

Example(s):
```
import org.junit.Test;
import static org.junit.Assert.*;

class SomeTestClass {
    Object a,b;
    @Test
    void testMethod() {
        assertTrue(a.equals(b)); // could be assertEquals(a, b);
        assertTrue(!a.equals(b)); // could be assertNotEquals(a, b);

        assertTrue(!something); // could be assertFalse(something);
        assertFalse(!something); // could be assertTrue(something);

        assertTrue(a == b); // could be assertSame(a, b);
        assertTrue(a != b); // could be assertNotSame(a, b);

        assertTrue(a == null); // could be assertNull(a);
        assertTrue(a != null); // could be assertNotNull(a);
    }
}
```
