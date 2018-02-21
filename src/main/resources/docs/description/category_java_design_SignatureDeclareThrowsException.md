Since: PMD 1.2

A method/constructor shouldn't explicitly throw the generic java.lang.Exception, since it
is unclear which exceptions that can be thrown from the methods. It might be
difficult to document and understand such vague interfaces. Use either a class
derived from RuntimeException or a checked exception.

Example(s):
```
public void foo() throws Exception {
}
```
