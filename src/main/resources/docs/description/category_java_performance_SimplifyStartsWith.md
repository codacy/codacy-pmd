Since: PMD 3.1

Calls to `string.startsWith(&quot;x&quot;)` with a string literal of length 1 can be rewritten using `string.charAt(0)`,
at the expense of some readability. To prevent `IndexOutOfBoundsException` being thrown by the `charAt` method,
ensure that the string is not empty by making an additional check first.

Example(s):
```
public class Foo {

    boolean checkIt(String x) {
        return x.startsWith("a");   // suboptimal
    }

    boolean fasterCheckIt(String x) {
        return !x.isEmpty() && x.charAt(0) == 'a';  // faster approach
    }
}
```
