Since: PMD 4.0

Calling new Short() causes memory allocation that can be avoided by the static Short.valueOf().
It makes use of an internal cache that recycles earlier instances making it more memory efficient.

Example(s):
```
public class Foo {
    private Short i = new Short(0); // change to Short i = Short.valueOf(0);
}
```
