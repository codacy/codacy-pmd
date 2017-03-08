Since: PMD 3.6

Avoid negation in an assertTrue or assertFalse test.

For example, rephrase:

   assertTrue(!expr);
   
as:

   assertFalse(expr);

Example(s):
```
public class SimpleTest extends TestCase {
   public void testX() {
     assertTrue("not empty", !r.isEmpty()); // replace with assertFalse("not empty", r.isEmpty())
     assertFalse(!r.isEmpty()); // replace with assertTrue(r.isEmpty())
   }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/junit.html#SimplifyBooleanAssertion)
