Since: PMD 3.2

To make sure the full stacktrace is printed out, use the logging statement with two arguments: a String and a Throwable.

This rule only applies to [Apache Commons Logging](https://commons.apache.org/proper/commons-logging/).

Example(s):
```
public class Main {
    private static final Log _LOG = LogFactory.getLog( Main.class );
    void bar() {
        try {
        } catch( Exception e ) {
            _LOG.error( e ); //Wrong!
        } catch( OtherException oe ) {
            _LOG.error( oe.getMessage(), oe ); //Correct
        }
    }
}
```
