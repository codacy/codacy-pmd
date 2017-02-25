Calling `new Byte()` causes memory allocation that can be avoided by the `static Byte.valueOf()`. It makes use of an internal cache that recycles earlier instances making it more memory efficient.

Ex:

```
public class Foo {
	private Byte i = new Byte(0); // change to Byte i =	Byte.valueOf(0);
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/migrating.html#ByteInstantiation)
