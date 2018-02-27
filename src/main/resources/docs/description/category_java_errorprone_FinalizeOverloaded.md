Since: PMD 1.5

Methods named finalize() should not have parameters.  It is confusing and most likely an attempt to
overload Object.finalize(). It will not be called by the VM.
            
Note that Oracle has declared Object.finalize() as deprecated since JDK 9.

Example(s):
```
public class Foo {
    // this is confusing and probably a bug
    protected void finalize(int a) {
    }
}
```
