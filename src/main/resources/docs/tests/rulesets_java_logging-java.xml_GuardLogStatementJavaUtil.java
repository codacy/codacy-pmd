//#Patterns: rulesets_java_logging-java.xml_GuardLogStatementJavaUtil

public class Foo {

    public static final Logger log = Logger.getLogger(Foo.class.getName());

    public void bar() {

        // Add this for performance

        if (log.isLoggable(Level.FINE)) {
            log.fine("log something" + " and " + "concat strings");
        }

        //#Warn: rulesets_java_logging-java.xml_GuardLogStatementJavaUtil
        log.fine("log something" + " and " + "concat strings");
    }
}

