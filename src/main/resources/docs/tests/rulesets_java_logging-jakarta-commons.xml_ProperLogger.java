//#Patterns: rulesets_java_logging-jakarta-commons.xml_ProperLogger

public class Foo {

    private static final Log LOG = LogFactory.getLog(Foo.class);
    // proper way protected

    //#Warn: rulesets_java_logging-jakarta-commons.xml_ProperLogger
    Log LOG2 = LogFactory.getLog(Testclass.class);
    // wrong approach
}