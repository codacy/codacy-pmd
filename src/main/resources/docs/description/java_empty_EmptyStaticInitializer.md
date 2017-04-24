Since: PMD 1.5

An empty static initializer serve no purpose and should be removed.

Example(s):
```
public class Foo {
	static {
	// empty
	}
}
```
