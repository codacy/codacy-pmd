Since: PMD 6.7.0

Configurable naming conventions for field declarations. This rule reports variable declarations
            which do not match the regex that applies to their specific kind ---e.g. constants (static final),
            enum constant, final field. Each regex can be configured on the PMD configuration file.
Check the [PMD documentation](https://pmd.github.io/pmd-7.4.0/pmd_rules_java_codestyle.html#fieldnamingconventions) for more information.

            By default this rule uses the standard Java naming convention (Camel case), and uses the ALL_UPPER
            convention for constants and enum constants.

Example(s):
```
class Foo {
                int myField = 1; // This is in camel case, so it's ok
                int my_Field = 1; // This contains an underscore, it's not ok by default
                                  // but you may allow it, or even require the "my_" prefix

                final int FinalField = 1; // you may configure a different convention for final fields,
                                          // e.g. here PascalCase: [A-Z][a-zA-Z0-9]*

                interface Interface {
                    double PI = 3.14; // interface "fields" use the constantPattern property
                }

                enum AnEnum {
                    ORG, NET, COM; // These use a separate property but are set to ALL_UPPER by default
                }
            }
```
