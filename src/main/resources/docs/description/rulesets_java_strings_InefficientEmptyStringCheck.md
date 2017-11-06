Since: PMD 3.6

String.trim().length() is an inefficient way to check if a String is really empty, as it
creates a new String object just to check its size. Consider creating a static function that
loops through a string, checking Character.isWhitespace() on each character and returning
false if a non-whitespace character is found. You can refer to Apache's StringUtils#isBlank (in commons-lang),
Spring's StringUtils#hasText (in the Spring framework) or Google's CharMatcher#whitespace (in Guava) for
existing implementations.

Example(s):
```
public void bar(String string) {
    if (string != null && string.trim().size() > 0) {
        doSomething();
    }
}
```
