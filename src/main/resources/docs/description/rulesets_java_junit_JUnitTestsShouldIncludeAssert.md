Since: PMD 2.0

JUnit tests should include at least one assertion.  This makes the tests more robust, and using assert 
with messages provide the developer a clearer idea of what the test does.

Example(s):
```
public class Foo extends TestCase {
   public void testSomething() {
      Bar b = findBar();
   // This is better than having a NullPointerException
   // assertNotNull("bar not found", b);
   b.work();
   }
}
```
