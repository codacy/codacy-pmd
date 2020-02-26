Since: PMD 2.0

Normally only one logger is used in each class. This rule supports slf4j, log4j, Java Util Logging and
log4j2 (since 6.19.0).

Example(s):
```
public class Foo {
    Logger log = Logger.getLogger(Foo.class.getName());
    // It is very rare to see two loggers on a class, normally
    // log information is multiplexed by levels
    Logger log2= Logger.getLogger(Foo.class.getName());
}
```
