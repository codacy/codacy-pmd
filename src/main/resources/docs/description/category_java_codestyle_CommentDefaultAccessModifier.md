Since: PMD 5.4.0

To avoid mistakes if we want that a Method, Constructor, Field or Nested class have a default access modifier
we must add a comment at the beginning of it's declaration.
By default the comment must be /* default */ or /* package */, if you want another, you have to provide a regular expression.

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
