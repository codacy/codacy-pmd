Since: PMD 5.1.0

Whenever using a log level, one should check if the loglevel is actually enabled, or
otherwise skip the associate String creation and manipulation.

Example(s):
```
// Add this for performance
    if (log.isDebugEnabled() { ...
        log.debug("log something" + " and " + "concat strings");
```

[Source](https://pmd.github.io/pmd-5.5.4/pmd-java/rules/java/logging-jakarta-commons.html#GuardLogStatement)
