Since: PMD 3.6

String.trim().length() == 0 (or String.trim().isEmpty() for the same reason) is an inefficient
way to check if a String is really blank, as it creates a new String object just to check its size.
Consider creating a static function that loops through a string, checking Character.isWhitespace()
on each character and returning false if a non-whitespace character is found. A Smarter code to
check for an empty string would be:

```java
private boolean checkTrimEmpty(String str) {
    for(int i = 0; i &lt; str.length(); i++) {
        if(!Character.isWhitespace(str.charAt(i))) {
            return false;
        }
    }
    return true;
}
```

You can refer to Apache's StringUtils#isBlank (in commons-lang),
Spring's StringUtils#hasText (in the Spring framework) or Google's
CharMatcher#whitespace (in Guava) for existing implementations (some might
include the check for != null).

Example(s):
```
public void bar(String string) {
    if (string != null && string.trim().length() > 0) {
        doSomething();
    }
}
```
