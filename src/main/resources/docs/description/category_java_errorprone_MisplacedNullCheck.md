Since: PMD 3.5

The null check here is misplaced. If the variable is null a `NullPointerException` will be thrown.
Either the check is useless (the variable will never be `null`) or it is incorrect.

Example(s):
```
public class Foo {
    void bar() {
        if (a.equals(baz) && a != null) {} // a could be null, misplaced null check

        if (a != null && a.equals(baz)) {} // correct null check
    }
}

        

public class Foo {
    void bar() {
        if (a.equals(baz) || a == null) {} // a could be null, misplaced null check

        if (a == null || a.equals(baz)) {} // correct null check
    }
}
```
