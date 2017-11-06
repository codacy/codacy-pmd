Since: PMD 0.7

The use of implementation types (i.e., HashSet) as object references limits your ability to use alternate
implementations in the future as requirements change. Whenever available, referencing objects
by their interface types (i.e, Set) provides much more flexibility.

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
