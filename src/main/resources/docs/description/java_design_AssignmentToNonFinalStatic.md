Since: PMD 2.2

Identifies a possible unsafe usage of a static field.

Example(s):
```
public class StaticField {
   static int x;
   public FinalFields(int y) {
    x = y; // unsafe
   }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#AssignmentToNonFinalStatic)
