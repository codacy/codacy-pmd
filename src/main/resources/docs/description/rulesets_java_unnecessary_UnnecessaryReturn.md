Since: PMD 1.3

Avoid the use of unnecessary return statements.

Example(s):
```
public class Foo {
    public void bar() {
        int x = 42;
        return;
    }
}
```
