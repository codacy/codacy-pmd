Since: PMD 1.0

Some JUnit framework methods are easy to misspell.

Example(s):
```
import junit.framework.*;

public class Foo extends TestCase {
   public void setup() {}    // oops, should be setUp
   public void TearDown() {} // oops, should be tearDown
}
```
