Since: PMD 3.5

Avoid concatenating characters as strings in StringBuffer/StringBuilder.append methods.

Example(s):
```
StringBuffer sb = new StringBuffer();
sb.append("a");		 // avoid this

StringBuffer sb = new StringBuffer();
sb.append('a');		// use this instead
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/strings.html#AppendCharacterWithChar)
