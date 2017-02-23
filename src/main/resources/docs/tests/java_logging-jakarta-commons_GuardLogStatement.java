//#Patterns: java_logging-jakarta-commons_GuardLogStatement
public class Foo {

    Logger log = Logger.getLogger(Foo.class.getName());

    public void bar() {

        // Add this for performance
        if (log.isDebugEnabled()) {
            log.debug("log something" + " and " + "concat strings");
        }

        //#Info: java_logging-jakarta-commons_GuardLogStatement
        log.debug("log something" + " and " + "concat strings");

    }
}

