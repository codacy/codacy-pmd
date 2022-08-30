Since: PMD 6.37.0

For any method that returns an collection (such as an array, Collection or Map), it is better to return
an empty one rather than a null reference. This removes the need for null checking all results and avoids
inadvertent NullPointerExceptions.

See Effective Java, 3rd Edition, Item 54: Return empty collections or arrays instead of null

Example(s):
```
public class Example {
    // Not a good idea...
    public int[] badBehavior() {
        // ...
        return null;
    }

    // Good behavior
    public String[] bonnePratique() {
        //...
        return new String[0];
    }
}
```
