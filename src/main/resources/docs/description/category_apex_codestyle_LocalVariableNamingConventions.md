Since: PMD 6.15.0

Configurable naming conventions for local variable declarations.
            This rule reports variable declarations which do not match the regex that applies to their
            specific kind (e.g. local variable, or final local variable). Each regex can be configured on the PMD configuration file.
Check the [PMD documentation](https://pmd.github.io/pmd-6.55.0/pmd_rules_apex_codestyle.html#localvariablenamingconventions) for more information.

            By default this rule uses the standard Apex naming convention (Camel case).

Example(s):
```
public class Foo {
    public Foo() {
        Integer localVariable; // This is in camel case, so it's ok

        Integer LOCAL_VARIABLE; // This will be reported unless you change the regex
    }
}
```
