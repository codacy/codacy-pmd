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
