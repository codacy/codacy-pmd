Since: PMD 1.2

Configurable naming conventions for type declarations. This rule reports
            type declarations which do not match the regex that applies to their
            specific kind (e.g. enum or interface). Each regex can be configured on the PMD configuration file.
Check the [PMD documentation](https://pmd.github.io/pmd-6.27.0/pmd_rules_java_codestyle.html#classnamingconventions) for more information.

            By default this rule uses the standard Java naming convention (Pascal case),
            and reports utility class names not ending with 'Util'.

Example(s):
```
// This is Pascal case, the recommended naming convention in Java
// Note that the default values of this rule don't allow underscores
// or accented characters in type names
public class FooBar {}

// You may want abstract classes to be named 'AbstractXXX',
// in which case you can customize the regex for abstract
// classes to 'Abstract[A-Z]\w+'
public abstract class Thing {}

// This class doesn't respect the convention, and will be flagged
public class Éléphant {}
```
