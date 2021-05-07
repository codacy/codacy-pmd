Since: PMD 0.1

Detects when a local variable is declared and/or assigned, but not used.
Variables whose name starts with `ignored` or `unused` are filtered out.

Example(s):
```
public class Foo {
    public void doSomething() {
        int i = 5; // Unused
    }
}
```
