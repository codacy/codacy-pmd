Avoid negation in an assertTrue or assertFalse test.

Ex:

public class SimpleTest extends TestCase {
   public void testX() {
     assertTrue("not empty", !r.isEmpty()); // replace with assertFalse("not empty", r.isEmpty())
     assertFalse(!r.isEmpty()); // replace with assertTrue(r.isEmpty())
   }
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/junit.html#SimplifyBooleanAssertion)
