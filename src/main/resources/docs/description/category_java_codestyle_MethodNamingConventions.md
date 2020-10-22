Since: PMD 1.2

Configurable naming conventions for method declarations. This rule reports
            method declarations which do not match the regex that applies to their
            specific kind (e.g. JUnit test or native method). Each regex can be configured on the PMD configuration file.
Check the [PMD documentation](https://pmd.github.io/pmd-6.28.0/pmd_rules_java_codestyle.html#methodnamingconventions) for more information.

            By default this rule uses the standard Java naming convention (Camel case).

Example(s):
```
public class Foo {
    public void fooStuff() {
    }
}
```
