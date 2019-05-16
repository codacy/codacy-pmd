Since: PMD 6.6.0

Configurable naming conventions for formal parameters of methods and lambdas.
            This rule reports formal parameters which do not match the regex that applies to their
            specific kind (e.g. lambda parameter, or final formal parameter). Each regex can be
            configured through properties.

            By default this rule uses the standard Java naming convention (Camel case).

Example(s):
```
class Foo {

                abstract void bar(int myInt); // This is Camel case, so it's ok

                void bar(int my_i) { // this will be reported

                }

                void lambdas() {

                    // lambdas parameters can be configured separately
                    Consumer<String> lambda1 = s_str -> { };

                    // lambda parameters with an explicit type can be configured separately
                    Consumer<String> lambda1 = (String str) -> { };

                }

            }
```
