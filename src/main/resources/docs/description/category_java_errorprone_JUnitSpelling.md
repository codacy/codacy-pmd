Since: PMD 1.0

In JUnit 3, the setUp method is used to set up all data entities required in running tests.
            The tearDown method is used to clean up all data entities required in running tests.
            You should not misspell method name if you want your test to set up and clean up everything correctly.

Example(s):
```
import junit.framework.*;

public class Foo extends TestCase {
    public void setup() {}    // oops, should be setUp
    public void TearDown() {} // oops, should be tearDown
}
```
