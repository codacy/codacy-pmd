Calling new Long() causes memory allocation that can be avoided by the static Long.valueOf(). It makes use of an internal cache that recycles earlier instances making it more memory efficient.

Ex:

public class Foo {
	private Long i = new Long(0); // change to Long i = Long.valueOf(0);
}


[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/migrating.html#LongInstantiation)
