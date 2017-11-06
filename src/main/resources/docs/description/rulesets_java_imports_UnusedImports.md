Since: PMD 1.0

Avoid unused import statements to prevent unwanted dependencies.
This rule will also find unused on demand imports, i.e. import com.foo.*.

Example(s):
```
import java.io.File;  // not referenced or required
import java.util.*;   // not referenced or required

public class Foo {}
```
