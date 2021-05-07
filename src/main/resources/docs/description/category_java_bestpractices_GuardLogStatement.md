Since: PMD 5.1.0

Whenever using a log level, one should check if the loglevel is actually enabled, or
otherwise skip the associate String creation and manipulation.

An alternative to checking the log level are substituting parameters, formatters or lazy logging
with lambdas. The available alternatives depend on the actual logging framework.

Example(s):
```
// Add this for performance
    if (log.isDebugEnabled()) {
        log.debug("log something" + " and " + "concat strings");
    }

    // Avoid the guarding if statement with substituting parameters
    log.debug("log something {} and {}", param1, param2);

    // Avoid the guarding if statement with formatters
    log.debug("log something %s and %s", param1, param2);

    // Avoid the guarding if statement with lazy logging and lambdas
    log.debug("log something expensive: {}", () -> calculateExpensiveLoggingText());
```
