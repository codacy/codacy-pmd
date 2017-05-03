Since: PMD 3.8

The null check is broken since it will throw a NullPointerException itself.
It is likely that you used || instead of &amp;&amp; or vice versa.

Example(s):
```
public String bar(String string) {
  // should be &&
	if (string!=null || !string.equals(""))
		return string;
  // should be ||
	if (string==null && string.equals(""))
		return string;
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/basic.html#BrokenNullCheck)
