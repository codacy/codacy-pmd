Since: PMD 5.5.0

Configurable naming conventions for type declarations. This rule reports
            type declarations which do not match the regex that applies to their
            specific kind (e.g. enum or interface). Each regex can be configured through
            properties.

            By default this rule uses the standard Apex naming convention (Pascal case).

Example(s):
```
public class FooClass { } // This is in pascal case, so it's ok

public class fooClass { } // This will be reported unless you change the regex
```
