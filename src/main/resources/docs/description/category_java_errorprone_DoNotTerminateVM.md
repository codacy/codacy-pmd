Since: PMD 4.1

Web applications should not call `System.exit()`, since only the web container or the
application server should stop the JVM. Otherwise a web application would terminate all other applications
running on the same application server.

This rule also checks for the equivalent calls `Runtime.getRuntime().exit()` and `Runtime.getRuntime().halt()`.

This rule was called *DoNotCallSystemExit* until PMD 6.29.0.

Example(s):
```
public void bar() {
    System.exit(0);                 // never call this when running in an application server!
}
public void foo() {
    Runtime.getRuntime().exit(0);   // never stop the JVM manually, the container will do this.
}
```
