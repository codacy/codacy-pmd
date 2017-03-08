Since: PMD 1.8

Avoid equality comparisons with Double.NaN. Due to the implicit lack of representation
precision when comparing floating point numbers these are likely to cause logic errors.

Example(s):
```
boolean x = (y == Double.NaN);
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#BadComparison)
