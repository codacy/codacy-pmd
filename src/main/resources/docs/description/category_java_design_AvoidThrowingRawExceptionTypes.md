Since: PMD 1.8

Avoid throwing certain exception types. Rather than throw a raw RuntimeException, Throwable,
Exception, or Error, use a subclassed exception or error instead.

Example(s):
```
public class Foo {
    public void bar() throws Exception {
        throw new Exception();
    }
}
```
