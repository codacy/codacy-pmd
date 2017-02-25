//#Patterns: java_logging-jakarta-commons_ProperLogger

public class Foo {

    private static final Log LOG = LogFactory.getLog(Foo.class);
    // proper way protected

    //#Info: java_logging-jakarta-commons_ProperLogger
    Log LOG2 = LogFactory.getLog(Testclass.class);
    // wrong approach
}