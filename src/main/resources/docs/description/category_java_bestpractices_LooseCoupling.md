Since: PMD 0.7

Excessive coupling to implementation types (e.g., `HashSet`) limits your ability to use alternate
implementations in the future as requirements change. Whenever available, declare variables
and parameters using a more general type (e.g, `Set`).

This rule reports uses of concrete collection types. User-defined types that should be treated
the same as interfaces can be configured with the property `allowedTypes`.

Example(s):
```
import java.util.ArrayList;
import java.util.HashSet;

public class Bar {
    // sub-optimal approach
    private ArrayList<SomeType> list = new ArrayList<>();

    public HashSet<SomeType> getFoo() {
        return new HashSet<SomeType>();
    }

    // preferred approach
    private List<SomeType> list = new ArrayList<>();

    public Set<SomeType> getFoo() {
        return new HashSet<SomeType>();
    }
}
```
