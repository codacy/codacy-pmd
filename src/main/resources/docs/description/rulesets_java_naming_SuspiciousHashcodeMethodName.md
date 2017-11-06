Since: PMD 1.5

The method name and return type are suspiciously close to hashCode(), which may denote an intention
to override the hashCode() method.

Example(s):
```
public class Foo {
    public int hashcode() { // oops, this probably was supposed to be 'hashCode'
    }
}
```
