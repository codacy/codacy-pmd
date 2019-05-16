Since: PMD 6.13.0

A method or constructor should not explicitly declare unchecked exceptions in its
`throws` clause. Java doesn't force the caller to handle an unchecked exception,
so it's unnecessary except for documentation. A better practice is to document the
exceptional cases with a `@throws` Javadoc tag, which allows being more descriptive.

Example(s):
```
public void foo() throws RuntimeException {
}
```
