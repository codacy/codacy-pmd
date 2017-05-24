Since: PMD 4.2

For any method that returns an array, it is a better to return an empty array rather than a
null reference. This removes the need for null checking all results and avoids inadvertent
NullPointerExceptions.

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
