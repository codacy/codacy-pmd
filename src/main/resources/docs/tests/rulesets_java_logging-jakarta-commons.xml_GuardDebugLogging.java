//#Patterns: rulesets_java_logging-jakarta-commons.xml_GuardDebugLogging

public class Test {
    private static final Log __log = LogFactory.getLog(Test.class);
    public void test() {
        // okay:
        __log.debug("log something");
        // okay:
        __log.debug("log something with exception", e);
        //#Warn: rulesets_java_logging-jakarta-commons.xml_GuardDebugLogging
        __log.debug("log something" + " and " + "concat strings");
        //#Warn: rulesets_java_logging-jakarta-commons.xml_GuardDebugLogging
        __log.debug("log something" + " and " + "concat strings", e);
        // good:
        if (__log.isDebugEnabled()) {
            __log.debug("bla" + "",e );
        }
    }
}