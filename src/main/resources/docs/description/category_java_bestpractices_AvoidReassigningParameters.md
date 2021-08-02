Since: PMD 1.0

Reassigning values to incoming parameters of a method or constructor is not recommended, as this can
make the code more difficult to understand. The code is often read with the assumption that parameter values
don't change and an assignment violates therefore the principle of least astonishment. This is especially a
problem if the parameter is documented e.g. in the method's javadoc and the new content differs from the original
documented content.

Use temporary local variables instead. This allows you to assign a new name, which makes the code better
understandable.

Note that this rule considers both methods and constructors. If there are multiple assignments for a formal
parameter, then only the first assignment is reported.

Example(s):
```
public class Hello {
  private void greet(String name) {
    name = name.trim();
    System.out.println("Hello " + name);

    // preferred
    String trimmedName = name.trim();
    System.out.println("Hello " + trimmedName);
  }
}
```
