Since: PMD 3.4

Consider replacing Vector usages with the newer java.util.ArrayList if expensive thread-safe operations are not required.

Example(s):
```
import java.util.Vector;
public class Foo {
    void bar() {
        Vector v = new Vector();
    }
}
```
