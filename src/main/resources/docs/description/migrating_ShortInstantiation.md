Calling `new Short()` causes memory allocation that can be avoided by the `static Short.valueOf()`. It makes use of an internal cache that recycles earlier instances making it more memory efficient.

Ex:

```
public class Foo {
	private Short i = new Short(0); // change to Short i = Short.valueOf(0);
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/migrating.html#ShortInstantiation)
