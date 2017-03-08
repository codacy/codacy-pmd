Since: PMD 0.3

For classes that only have static methods, consider making them utility classes.
Note that this doesn't apply to abstract classes, since their subclasses may
well include non-static methods.  Also, if you want this class to be a utility class,
remember to add a private constructor to prevent instantiation.
(Note, that this use was known before PMD 5.1.0 as UseSingleton).

Example(s):
```
public class MaybeAUtility {
  public static void foo() {}
  public static void bar() {}
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#UseUtilityClass)
