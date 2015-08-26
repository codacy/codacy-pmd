No need to call String.valueOf to append to a string; just use the valueOf() argument directly.

Ex:

public String convert(int i) {
	String s;
	s = "a" + String.valueOf(i);	// not required
	s = "a" + i; 					// preferred approach
	return s;
}

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strings.html#UselessStringValueOf)
