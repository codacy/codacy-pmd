Since: PMD 6.18.0

The first parameter of System.debug, when using the signature with two parameters, is a LoggingLevel enum.

Having the Logging Level specified provides a cleaner log, and improves readability of it.

Example(s):
```
@isTest
public class Foo {
    @isTest
    static void bar() {
        System.debug('Hey this code executed.'); // not good
        System.debug(LoggingLevel.WARN, 'Hey, something might be wrong.'); // good
        System.debug(LoggingLevel.DEBUG, 'Hey, something happened.'); // not good when on strict mode
    }
}
```
