Since: PMD 1.02

Fields in interfaces and annotations are automatically `public static final`, and methods are `public abstract`.
Classes, interfaces or annotations nested in an interface or annotation are automatically `public static`
(all nested interfaces and annotations are automatically static).
Nested enums are automatically `static`.
For historical reasons, modifiers which are implied by the context are accepted by the compiler, but are superfluous.

Example(s):
```
public @interface Annotation {
  public abstract void bar(); 		// both abstract and public are ignored by the compiler
  public static final int X = 0; 	// public, static, and final all ignored
  public static class Bar {} 		// public, static ignored
  public static interface Baz {} 	// ditto
}
public interface Foo {
  public abstract void bar(); 		// both abstract and public are ignored by the compiler
  public static final int X = 0; 	// public, static, and final all ignored
  public static class Bar {} 		// public, static ignored
  public static interface Baz {} 	// ditto
}
public class Bar {
  public static interface Baz {} // static ignored
  public static enum FoorBar { // static ignored
    FOO;
  }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/unnecessary.html#UnnecessaryModifier)
