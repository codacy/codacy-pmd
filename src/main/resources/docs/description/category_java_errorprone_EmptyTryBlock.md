Since: PMD 0.4

Avoid empty try blocks - what's the point?

Example(s):
```
public class Foo {
    public void bar() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
