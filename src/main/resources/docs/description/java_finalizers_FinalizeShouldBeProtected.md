Since: PMD 1.1

When overriding the finalize(), the new method should be set as protected.  If made public, 
other classes may invoke it at inappropriate times.

Example(s):
```
public void finalize() {
	// do something
}
```
