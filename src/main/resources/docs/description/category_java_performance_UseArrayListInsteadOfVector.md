Since: PMD 3.0

ArrayList is a much better Collection implementation than Vector if thread-safe operation is not required.

Example(s):
```
import java.util.*;
public class SimpleTest extends TestCase {
    public void testX() {
    Collection c1 = new Vector();
    Collection c2 = new ArrayList();    // achieves the same with much better performance
    }
}
```
