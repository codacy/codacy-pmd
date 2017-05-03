Since: PMD 3.1

Sometimes expressions are wrapped in unnecessary parentheses, making them look like function calls.

Example(s):
```
public class Foo {
   boolean bar() {
      return (true);
      }
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/controversial.html#UnnecessaryParentheses)
