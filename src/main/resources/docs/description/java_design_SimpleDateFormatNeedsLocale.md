Since: PMD 2.0

Be sure to specify a Locale when creating SimpleDateFormat instances to ensure that locale-appropriate
formatting is used.

Example(s):
```
public class Foo {
  // Should specify Locale.US (or whatever)
  private SimpleDateFormat sdf = new SimpleDateFormat("pattern");
}
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/design.html#SimpleDateFormatNeedsLocale)
