`StringBuffers`/`StringBuilders` can grow considerably, and so may become a source of memory leaks if held within objects with long lifetimes.

Ex:

```
public class Foo {
	private StringBuffer buffer;	// potential memory leak as an instance variable;
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/strings.html#AvoidStringBufferField)
