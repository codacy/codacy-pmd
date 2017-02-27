Import statements allow the use of non-fully qualified names. The use of a fully qualified name which is covered by an import statement is redundant. Consider using the non-fully qualified name.

Ex:

```
import java.util.List;

public class Foo {
  private java.util.List list1; // Unnecessary Fully Qualified Name
  private List list2; // More appropriate given import of 'java.util.List'
}
```

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/imports.html#UnnecessaryFullyQualifiedName)
