Since: PMD 6.13.0

The method appears to be a test case since it has public or default visibility,
non-static access, no arguments, no return value, has no annotations, but is a
member of a class that has one or more JUnit test cases. If it is a utility
method, it should likely have private visibility. If it is an ignored test, it
should be annotated with @Test and @Ignore.

Example(s):
```
public class MyTest {
    @Test
    public void someTest() {
    }

    // violation: Not annotated
    public void someOtherTest () {
    }

}
```
