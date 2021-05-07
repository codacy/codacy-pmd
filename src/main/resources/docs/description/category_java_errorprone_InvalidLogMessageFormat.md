Since: PMD 5.5.0

Check for messages in slf4j and log4j2 (since 6.19.0) loggers with non matching number of arguments and placeholders.

Since 6.32.0 in addition to parameterized message placeholders (`{}`) also format specifiers of string formatted
messages are supported (`%s`).

Example(s):
```
LOGGER.error("forget the arg {}");
LOGGER.error("forget the arg %s");
LOGGER.error("too many args {}", "arg1", "arg2");
LOGGER.error("param {}", "arg1", new IllegalStateException("arg")); //The exception is shown separately, so is correct.
```
