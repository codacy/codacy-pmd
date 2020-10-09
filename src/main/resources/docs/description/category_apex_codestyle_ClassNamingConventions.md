Since: PMD 5.5.0

Configurable naming conventions for type declarations. This rule reports
            type declarations which do not match the regex that applies to their
            specific kind (e.g. enum or interface). Each regex can be configured on the PMD configuration file.
Check the [PMD documentation](https://pmd.github.io/pmd-6.27.0/pmd_rules_apex_codestyle.html#classnamingconventions) for more information.

            By default this rule uses the standard Apex naming convention (Pascal case).

Example(s):
```
public class FooClass { } // This is in pascal case, so it's ok

public class fooClass { } // This will be reported unless you change the regex
```
