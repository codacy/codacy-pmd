Since: PMD 1.05

Avoid returning from a finally block, this can discard exceptions.

Example(s):
```
public class Bar {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K."; // return not recommended here
        }
    }
}
```
