Since: PMD 4.1

Avoid using final local variables, turn them into fields.

Example(s):
```
public class MyClass {
    public void foo() {
        final String finalLocalVariable;
    }
}
```
