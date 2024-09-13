Since: PMD 6.34.0

Reports import statements that can be removed. They are either unused,
            duplicated, or the members they import are already implicitly in scope,
            because they're in java.lang, or the current package.

            If some imports cannot be resolved, for instance because you run PMD with
            an incomplete auxiliary classpath, some imports may be conservatively marked
            as used even if they're not to avoid false positives.

Example(s):
```
import java.io.File;            // not used, can be removed
            import java.util.Collections;   // used below
            import java.util.*;             // so this one is not used

            import java.lang.Object;        // imports from java.lang, unnecessary
            import java.lang.Object;        // duplicate, unnecessary

            public class Foo {
                static Object emptyList() {
                    return Collections.emptyList();
                }
            }
```
