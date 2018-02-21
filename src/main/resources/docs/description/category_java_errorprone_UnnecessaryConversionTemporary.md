Since: PMD 0.1

Avoid the use temporary objects when converting primitives to Strings. Use the static conversion methods
on the wrapper classes instead.

Example(s):
```
public String convert(int x) {
    String foo = new Integer(x).toString(); // this wastes an object

    return Integer.toString(x);             // preferred approach
}
```
