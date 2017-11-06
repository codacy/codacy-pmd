Since: PMD 3.5

Calling new Integer() causes memory allocation that can be avoided by the static Integer.valueOf().
It makes use of an internal cache that recycles earlier instances making it more memory efficient.

Example(s):
```
public class Foo {
    private Integer i = new Integer(0); // change to Integer i = Integer.valueOf(0);
}
```
