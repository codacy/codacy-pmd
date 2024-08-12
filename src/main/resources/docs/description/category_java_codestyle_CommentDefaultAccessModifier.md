Since: PMD 5.4.0

To avoid mistakes if we want that an Annotation, Class, Enum, Method, Constructor or Field have a default access modifier
we must add a comment at the beginning of its declaration.
By default, the comment must be `/* default */` or `/* package */`, if you want another, you have to provide a regular expression.

This rule ignores by default all cases that have a `@VisibleForTesting` annotation or any JUnit5/TestNG annotation. Use the
property &quot;ignoredAnnotations&quot; to customize the recognized annotations.

Example(s):
```
public class Foo {
    final String stringValue = "some string";
    String getString() {
       return stringValue;
    }

    class NestedFoo {
    }
}

// should be
public class Foo {
    /* default */ final String stringValue = "some string";
    /* default */ String getString() {
       return stringValue;
    }

    /* default */ class NestedFoo {
    }
}
```
