Since: PMD 3.7

Throwing a new exception from a catch block without passing the original exception into the
new exception will cause the original stack trace to be lost making it difficult to debug
effectively.

Example(s):
```
public class Foo {
    void good() {
        try{
            Integer.parseInt("a");
        } catch (Exception e) {
            throw new Exception(e); // first possibility to create exception chain
        }
        try {
            Integer.parseInt("a");
        } catch (Exception e) {
            throw (IllegalStateException)new IllegalStateException().initCause(e); // second possibility to create exception chain.
        }
    }
    void bad() {
        try{
            Integer.parseInt("a");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
```
