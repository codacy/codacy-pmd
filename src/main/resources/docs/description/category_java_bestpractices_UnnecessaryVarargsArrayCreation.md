Since: PMD 7.1.0

Reports explicit array creation when a varargs is expected.
            For instance:
            ```java
            Arrays.asList(new String[] { &quot;foo&quot;, &quot;bar&quot;, });
            ```
            can be replaced by:
            ```java
            Arrays.asList(&quot;foo&quot;, &quot;bar&quot;);
            ```

Example(s):
```
import java.util.Arrays;

class C {
    static {
        Arrays.asList(new String[]{"foo", "bar",});
        // should be
        Arrays.asList("foo", "bar");
    }
}
```
