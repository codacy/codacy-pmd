//#Patterns: category_java_errorprone_LoggerIsNotStaticFinal

public class Foo{

    //#Warn: category_java_errorprone_LoggerIsNotStaticFinal
    public Logger log = Logger.getLogger(Foo.class.getName());
    // not recommended

    public static final Logger log2 = Logger.getLogger(Foo.class.getName());
    // preferred approach
}
