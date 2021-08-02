Since: PMD 6.15.0

Configurable naming conventions for formal parameters of methods.
            This rule reports formal parameters which do not match the regex that applies to their
            specific kind (e.g. method parameter, or final method parameter). Each regex can be configured on the PMD configuration file.
Check the [PMD documentation](https://pmd.github.io/pmd-6.36.0/pmd_rules_apex_codestyle.html#formalparameternamingconventions) for more information.

            By default this rule uses the standard Apex naming convention (Camel case).

Example(s):
```
public class Foo {
    public bar(Integer methodParameter) { } // This is in camel case, so it's ok

    public baz(Integer METHOD_PARAMETER) { } // This will be reported unless you change the regex
}
```
