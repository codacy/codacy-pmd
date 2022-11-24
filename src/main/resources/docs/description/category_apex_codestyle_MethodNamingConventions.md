Since: PMD 5.5.0

Configurable naming conventions for method declarations. This rule reports
            method declarations which do not match the regex that applies to their
            specific kind (e.g. static method, or test method). Each regex can be configured on the PMD configuration file.
Check the [PMD documentation](https://pmd.github.io/pmd-6.51.0/pmd_rules_apex_codestyle.html#methodnamingconventions) for more information.

            By default this rule uses the standard Apex naming convention (Camel case).

Example(s):
```
public class Foo {
    public void instanceMethod() { } // This is in camel case, so it's ok

    public void INSTANCE_METHOD() { } // This will be reported unless you change the regex
```
