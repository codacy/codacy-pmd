Since: PMD 3.1

Since it passes in a literal of length 1, calls to (string).startsWith can be rewritten using (string).charAt(0)
at the expense of some readability.

Example(s):
```
public class Foo {

    boolean checkIt(String x) {
        return x.startsWith("a");   // suboptimal
    }

    boolean fasterCheckIt(String x) {
        return x.charAt(0) == 'a';  // faster approach
    }
}
```
