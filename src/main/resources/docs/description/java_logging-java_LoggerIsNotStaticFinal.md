Since: PMD 2.0

In most cases, the Logger reference can be declared as static and final.

Example(s):
```
public class Foo{
    Logger log = Logger.getLogger(Foo.class.getName());					// not recommended

    static final Logger log = Logger.getLogger(Foo.class.getName());	// preferred approach
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/logging-java.html#LoggerIsNotStaticFinal)
