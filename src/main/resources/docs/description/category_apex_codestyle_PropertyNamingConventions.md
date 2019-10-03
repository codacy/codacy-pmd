Since: PMD 6.15.0

Configurable naming conventions for property declarations. This rule reports
            property declarations which do not match the regex that applies to their
            specific kind (e.g. static property, or instance property). Each regex can be
            configured through properties.

            By default this rule uses the standard Apex naming convention (Camel case).

Example(s):
```
public class Foo {
    public Integer instanceProperty { get; set; } // This is in camel case, so it's ok

    public Integer INSTANCE_PROPERTY { get; set; } // This will be reported unless you change the regex
}
```
