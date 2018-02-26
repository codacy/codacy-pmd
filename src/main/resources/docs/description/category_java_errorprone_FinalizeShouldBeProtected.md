Since: PMD 1.1

When overriding the finalize(), the new method should be set as protected.  If made public, 
other classes may invoke it at inappropriate times.
            
Note that Oracle has declared Object.finalize() as deprecated since JDK 9.

Example(s):
```
public void finalize() {
    // do something
}
```
