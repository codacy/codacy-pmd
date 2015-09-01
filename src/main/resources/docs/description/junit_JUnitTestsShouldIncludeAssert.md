JUnit tests should include at least one assertion. This makes the tests more robust, and using assert with messages provide the developer a clearer idea of what the test does.

Ex:

public class Foo extends TestCase {
   public void testSomething() {
      Bar b = findBar();
   // This is better than having a NullPointerException
   // assertNotNull("bar not found", b);
   b.work();
   }
}
    
[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/junit.html#JUnitTestsShouldIncludeAssert)
