Since: PMD 5.5.0

Check for messages in slf4j loggers with non matching number of arguments and placeholders.

Example(s):
```
LOGGER.error("forget the arg {}");
LOGGER.error("too many args {}", "arg1", "arg2");
LOGGER.error("param {}", "arg1", new IllegalStateException("arg")); //The exception is shown separately, so is correct.
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/logging-java.html#InvalidSlf4jMessageFormat)
