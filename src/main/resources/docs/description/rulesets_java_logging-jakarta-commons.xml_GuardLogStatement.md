Whenever using a log level, one should check if the loglevel is actually enabled, or otherwise skip the associate String creation and manipulation.

Ex:

// Add this for performance
if (log.isDebugEnabled() { ...
    log.debug("log something" + " and " + "concat strings");

[SOURCE](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/logging-jakarta-commons.html#GuardLogStatement)
