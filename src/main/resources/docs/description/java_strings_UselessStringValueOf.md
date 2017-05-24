Since: PMD 3.8

No need to call String.valueOf to append to a string; just use the valueOf() argument directly.

Example(s):
```
public String convert(int i) {
	String s;
	s = "a" + String.valueOf(i);	// not required
	s = "a" + i; 					// preferred approach
	return s;
}
```
