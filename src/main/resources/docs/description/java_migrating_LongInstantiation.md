Since: PMD 4.0

Calling new Long() causes memory allocation that can be avoided by the static Long.valueOf().
It makes use of an internal cache that recycles earlier instances making it more memory efficient.

Example(s):
```
public class Foo {
	private Long i = new Long(0); // change to Long i = Long.valueOf(0);
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/migrating.html#LongInstantiation)
