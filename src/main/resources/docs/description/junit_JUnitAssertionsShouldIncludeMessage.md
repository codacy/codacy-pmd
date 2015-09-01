JUnit assertions should include an informative message - i.e., use the three-argument version of assertEquals(), not the two-argument version.

Ex:

public class Foo extends TestCase {
 public void testSomething() {
  assertEquals("foo", "bar");
  // Use the form:
  // assertEquals("Foo does not equals bar", "foo", "bar");
  // instead
 }
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/junit.html#JUnitAssertionsShouldIncludeMessage)
