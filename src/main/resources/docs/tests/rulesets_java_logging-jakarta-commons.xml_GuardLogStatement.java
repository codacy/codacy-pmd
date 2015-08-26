//#Patterns: rulesets_java_logging-jakarta-commons.xml_GuardLogStatement
public class Foo {

    Logger log = Logger.getLogger(Foo.class.getName());

    public void bar() {

        // Add this for performance
        if (log.isDebugEnabled()) {
            log.debug("log something" + " and " + "concat strings");
        }

        //#Warn: rulesets_java_logging-jakarta-commons.xml_GuardLogStatement
        log.debug("log something" + " and " + "concat strings");

    }
}

