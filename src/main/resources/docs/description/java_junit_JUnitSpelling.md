Some JUnit framework methods are easy to misspell.

Ex:

```
import junit.framework.*;

public class Foo extends TestCase {
   public void setup() {}    // oops, should be setUp
   public void TearDown() {} // oops, should be tearDown
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/junit.html#JUnitSpelling)
