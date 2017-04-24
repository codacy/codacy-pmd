Since: PMD 3.0

It is somewhat confusing to have a field name matching the declaring class name.
This probably means that type and/or field names should be chosen more carefully.

Example(s):
```
public class Foo extends Bar {
	int foo;	// There is probably a better name that can be used
}
```
