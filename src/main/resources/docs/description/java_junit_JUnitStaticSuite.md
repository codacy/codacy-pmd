Since: PMD 1.0

The suite() method in a JUnit test needs to be both public and static.

Example(s):
```
import junit.framework.*;

public class Foo extends TestCase {
   public void suite() {}         // oops, should be static
   private static void suite() {} // oops, should be public
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/junit.html#JUnitStaticSuite)
