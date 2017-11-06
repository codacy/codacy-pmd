Since: PMD 4.2

If an abstract class does not provides any methods, it may be acting as a simple data container
that is not meant to be instantiated. In this case, it is probably better to use a private or
protected constructor in order to prevent instantiation than make the class misleadingly abstract.

Example(s):
```
public class abstract Example {
    String field;
    int otherField;
}
```
