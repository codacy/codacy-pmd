Since: PMD 2.1

References to System.(out|err).print are usually intended for debugging purposes and can remain in
the codebase even in production code. By using a logger one can enable/disable this behaviour at
will (and by priority) and avoid clogging the Standard out log.

Example(s):
```
class Foo{
    Logger log = Logger.getLogger(Foo.class.getName());
    public void testA () {
        System.out.println("Entering test");
        // Better use this
        log.fine("Entering test");
    }
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/logging-java.html#SystemPrintln)
