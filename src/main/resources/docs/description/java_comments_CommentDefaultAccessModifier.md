Since: PMD 5.4.0

To avoid mistakes if we want that a Method, Field or Nested class have a default access modifier
        we must add a comment at the beginning of the Method, Field or Nested class.
        By default the comment must be /* default */, if you want another, you have to provide a regex.

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

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/comments.html#CommentDefaultAccessModifier)
