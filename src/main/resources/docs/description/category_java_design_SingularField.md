Since: PMD 3.1

Reports fields which may be converted to a local variable. This is so because
in every method where the field is used, it is assigned before it is first read.
Hence, the value that the field had before the method call may not be observed,
so it might as well not be stored in the enclosing object.

Limitations:
* We can only check private fields for now.
* The rule is not aware of threading, so it may cause false positives in concurrent code.
Such FPs are best handled by suppression (see also the `ignoredAnnotations` property).

Example(s):
```
public class Foo {
    private int x; // this will be reported

    public int foo(int y) {
       x = y + 5; // assigned before any read
       return x;
    }

    public int fooOk(int y) {
       int z = y + 5; // might as well be a local like here
       return z;
    }
}
```
