Since: PMD 6.52.0

Identifies beans, that don't follow the [JavaBeans API specification](https://download.oracle.com/otndocs/jcp/7224-javabeans-1.01-fr-spec-oth-JSpec/).

Each non-static field should have both a getter and a setter method. If the field is just used internally and is not
a bean property, then the field should be marked as `transient`.

The rule verifies that the type of the field is the same as the result type of the getter. And that this type matches
the type used in the setter.

The rule also checks, that there is a no-arg or default constructor available.

Optionally the rule also verifies, that the bean implements `java.io.Serializable`. While this is a requirement for the
original JavaBeans specification, frameworks nowadays don't strictly require this anymore.

In order to avoid many false positives in classes that are not beans, the rule needs to be explicitly
enabled by configuring the property `packages`.

Example(s):
```
package org.example.beans;
public class MyBean {        // <-- bean is not serializable, missing "implements Serializable"
    private String label;    // <-- missing setter for property "label"

    public String getLabel() {
        return label;
    }
}
```
