Since: PMD 3.7

Reports exceptions that are thrown from within a catch block, yet don't refer to the
exception parameter declared by that catch block. The stack trace of the original
exception could be lost, which makes the thrown exception less informative.

To preserve the stack trace, the original exception may be used as the cause of
the new exception, using `Throwable#initCause`, or passed as a constructor argument
to the new exception. It may also be preserved using `Throwable#addSuppressed`.
The rule actually assumes that any method or constructor that takes the original
exception as argument preserves the original stack trace.

The rule allows `InvocationTargetException` and `PrivilegedActionException` to be
replaced by their cause exception. The discarded part of the stack trace is in those
cases only JDK-internal code, which is not very useful. The rule also ignores exceptions
whose name starts with `ignored`.

Example(s):
```
public class Foo {
    void good() {
        try{
            Integer.parseInt("a");
        } catch (Exception e) {
            throw new Exception(e); // Ok, this initializes the cause of the new exception
        }
        try {
            Integer.parseInt("a");
        } catch (Exception e) {
            throw (IllegalStateException)new IllegalStateException().initCause(e); // second possibility to create exception chain.
        }
    }
    void wrong() {
        try{
            Integer.parseInt("a");
        } catch (Exception e) {
            // Violation: this only preserves the message and not the stack trace
            throw new Exception(e.getMessage());
        }
    }
}
```
