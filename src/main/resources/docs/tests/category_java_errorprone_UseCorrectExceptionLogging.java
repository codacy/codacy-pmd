//#Patterns: category_java_errorprone_UseCorrectExceptionLogging

public class Main {
    private static final Log _LOG = LogFactory.getLog( Main.class );

    void bar() {
        try {

        } catch( Exception e ) {
            //#Warn: category_java_errorprone_UseCorrectExceptionLogging
            _LOG.error( e ); //Wrong!

        } catch( OtherException oe ) {
            _LOG.error( oe.getMessage(), oe );
            //Correct

        }
    }
}
