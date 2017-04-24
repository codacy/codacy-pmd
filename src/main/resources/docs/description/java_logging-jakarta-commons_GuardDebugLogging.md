Since: PMD 4.3

When log messages are composed by concatenating strings, the whole section should be guarded
            by a isDebugEnabled() check to avoid performance and memory issues.

Example(s):
```
public class Test {
    private static final Log __log = LogFactory.getLog(Test.class);
    public void test() {
        // okay:
        __log.debug("log something");

        // okay:
        __log.debug("log something with exception", e);

        // bad:
        __log.debug("log something" + " and " + "concat strings");

        // bad:
        __log.debug("log something" + " and " + "concat strings", e);

        // good:
        if (__log.isDebugEnabled()) {
        __log.debug("bla" + "",e );
        }
    }
}
```
