Avoid concatenating characters as `strings` in `StringBuffer`/`StringBuilder.append` methods.

Ex:

```
StringBuffer sb = new StringBuffer();
sb.append("a");		 // avoid this

StringBuffer sb = new StringBuffer();
sb.append('a');		// use this instead
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strings.html#AppendCharacterWithChar)
