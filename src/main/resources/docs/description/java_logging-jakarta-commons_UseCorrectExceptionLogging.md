To make sure the full `stacktrace` is printed out, use the logging statement with two arguments: a `String` and a `Throwable`.

Ex:

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

[Source](https://pmd.github.io/pmd-5.3.3/pmd-java/rules/java/logging-jakarta-commons.html#UseCorrectExceptionLogging)
