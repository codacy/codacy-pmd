Since: PMD 0.1

Detects when a private field is declared and/or assigned a value, but not used.

Since PMD 6.50.0 private fields are ignored, if the fields are annotated with any annotation or the
enclosing class has any annotation. Annotations often enable a framework (such as dependency injection, mocking
or e.g. Lombok) which use the fields by reflection or other means. This usage can't be detected by static code analysis.
Previously these frameworks where explicitly allowed by listing their annotations in the property
&quot;ignoredAnnotations&quot;, but that turned out to be prone of false positive for any not explicitly considered framework.

Example(s):
```
public class Something {
    private static int FOO = 2; // Unused
    private int i = 5; // Unused
    private int j = 6;
    public int addOne() {
        return j++;
    }
}
```
