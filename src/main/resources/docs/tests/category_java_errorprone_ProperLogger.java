//#Patterns: category_java_errorprone_ProperLogger

public class Foo {

    private static final Log LOG = LogFactory.getLog(Foo.class);
    // proper way protected

    //#Warn: category_java_errorprone_ProperLogger
    Log LOG2 = LogFactory.getLog(Testclass.class);
    // wrong approach
}
