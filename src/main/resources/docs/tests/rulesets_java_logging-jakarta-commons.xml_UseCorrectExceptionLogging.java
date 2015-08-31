//#Patterns: logging-jakarta-commons_UseCorrectExceptionLogging

public class Main {
    private static final Log _LOG = LogFactory.getLog( Main.class );

    void bar() {
        try {

        } catch( Exception e ) {
            //#Warn: logging-jakarta-commons_UseCorrectExceptionLogging
            _LOG.error( e ); //Wrong!

        } catch( OtherException oe ) {
            _LOG.error( oe.getMessage(), oe );
            //Correct

        }
    }
}