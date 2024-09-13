Since: PMD 5.1.0

Whenever using a log level, one should check if it is actually enabled, or
otherwise skip the associate String creation and manipulation, as well as any method calls.

An alternative to checking the log level are substituting parameters, formatters or lazy logging
with lambdas. The available alternatives depend on the actual logging framework.

Example(s):
```
// Add this for performance - avoid manipulating strings if the logger may drop it
if (log.isDebugEnabled()) {
    log.debug("log something" + param1 + " and " + param2 + "concat strings");
}

// Avoid the guarding if statement with substituting parameters
log.debug("log something {} and {}", param1, param2);

// Avoid the guarding if statement with formatters
log.debug("log something %s and %s", param1, param2);

// This is still an issue, method invocations may be expensive / have side-effects
log.debug("log something expensive: {}", calculateExpensiveLoggingText());

// Avoid the guarding if statement with lazy logging and lambdas
log.debug("log something expensive: {}", () -> calculateExpensiveLoggingText());

// … alternatively use method references
log.debug("log something expensive: {}", this::calculateExpensiveLoggingText);
```
