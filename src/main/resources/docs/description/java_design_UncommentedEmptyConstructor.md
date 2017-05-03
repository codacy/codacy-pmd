Since: PMD 3.4

Uncommented Empty Constructor finds instances where a constructor does not
contain statements, but there is no comment. By explicitly commenting empty
constructors it is easier to distinguish between intentional (commented)
and unintentional empty constructors.

Example(s):
```
public Foo() {
  // This constructor is intentionally empty. Nothing special is needed here.
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/design.html#UncommentedEmptyConstructor)
