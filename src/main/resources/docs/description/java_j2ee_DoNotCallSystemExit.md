Since: PMD 4.1

Web applications should not call System.exit(), since only the web container or the
application server should stop the JVM. This rule also checks for the equivalent call Runtime.getRuntime().exit().

Example(s):
```
public void bar() {
    System.exit(0);                 // never call this when running in an application server!
}
public void foo() {
    Runtime.getRuntime().exit(0);   // never stop the JVM manually, the container will do this.
}
```
