Since: PMD 6.0.0

Avoid empty try or finally blocks - what's the point?

Example(s):
```
public class Foo {
    public void bar() {
        try {
          // empty !
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Foo {
    public void bar() {
        try {
            Integer x=2;
        } finally {
            // empty!
        }
    }
}
```
