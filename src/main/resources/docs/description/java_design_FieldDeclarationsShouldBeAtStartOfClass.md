Since: PMD 5.0

Fields should be declared at the top of the class, before any method declarations, constructors, initializers or inner classes.

Example(s):
```
public class HelloWorldBean {

  // Field declared before methods / inner classes - OK
  private String _thing;

  public String getMessage() {
    return "Hello World!";
  }

  // Field declared after methods / inner classes - avoid this
  private String _fieldInWrongLocation;
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#FieldDeclarationsShouldBeAtStartOfClass)
