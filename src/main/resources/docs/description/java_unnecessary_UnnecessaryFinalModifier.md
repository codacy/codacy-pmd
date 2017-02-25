When a `class` has the `final` modifier, all the methods are automatically `final` and therefore do not need to be tagged as such.

Ex:

```
public final class Foo {
  // This final modifier is not necessary, since the class is final
  private final void foo() { } //the final tag here is unnecessary
}
```

[Source](http://pmd.sourceforge.net/pmd-5.3.2/pmd-java/rules/java/unnecessary.html#UnnecessaryFinalModifier)
