Since: PMD 4.0

It is unclear which exceptions that can be thrown from the methods.
It might be difficult to document and understand the vague interfaces.
Use either a class derived from RuntimeException or a checked exception.

JUnit classes are excluded.

Example(s):
```
public void methodThrowingException() throws Exception {
}
```
