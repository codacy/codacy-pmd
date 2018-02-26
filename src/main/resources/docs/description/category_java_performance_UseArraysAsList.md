Since: PMD 3.5

The java.util.Arrays class has a &quot;asList&quot; method that should be used when you want to create a new List from
an array of objects. It is faster than executing a loop to copy all the elements of the array one by one.

Note that the result of Arrays.asList() is backed by the specified array,
changes in the returned list will result in the array to be modified.
For that reason, it is not possible to add new elements to the returned list of Arrays.asList() (UnsupportedOperationException).
You must use new ArrayList&lt;&gt;(Arrays.asList(...)) if that is inconvenient for you (e.g. because of concurrent access).

Example(s):
```
public class Test {
    public void foo(Integer[] ints) {
        // could just use Arrays.asList(ints)
        List<Integer> l= new ArrayList<>(100);
        for (int i=0; i< 100; i++) {
            l.add(ints[i]);
        }
        for (int i=0; i< 100; i++) {
            l.add(a[i].toString()); // won't trigger the rule
        }
    }
}
```
