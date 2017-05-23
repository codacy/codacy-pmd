Since: PMD 5.1.0

Whenever using a log level, one should check if the loglevel is actually enabled, or
otherwise skip the associate String creation and manipulation.

Example(s):
```
// Add this for performance
	if (log.isLoggable(Level.FINE)) { ...
 	    log.fine("log something" + " and " + "concat strings");
```
