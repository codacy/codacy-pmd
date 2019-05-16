Since: PMD 6.10.0

Since Java 1.7, numeric literals can use underscores to separate digits. This rule enforces that
            numeric literals above a certain length use these underscores to increase readability.

            The rule only supports decimal (base 10) literals for now. The acceptable length under which literals
            are not required to have underscores is configurable via a property. Even under that length, underscores
            that are misplaced (not making groups of 3 digits) are reported.

Example(s):
```
public class Foo {
    private int num = 1000000; // should be 1_000_000
}
```
