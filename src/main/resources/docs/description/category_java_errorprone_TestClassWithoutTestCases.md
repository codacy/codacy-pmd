Since: PMD 3.0

Test classes typically end with the suffix &quot;Test&quot;, &quot;Tests&quot; or &quot;TestCase&quot;. Having a non-test class with that name
is not a good practice, since most people will assume it is a test case. Test classes have test methods
named &quot;testXXX&quot; (JUnit3) or use annotations (e.g. `@Test`).

The suffix can be configured using the property `testClassPattern`. To disable the detection of possible test classes
by name, set this property to an empty string.

Example(s):
```
//Consider changing the name of the class if it is not a test
//Consider adding test methods if it is a test
public class CarTest {
   public static void main(String[] args) {
    // do something
   }
   // code
}
```
